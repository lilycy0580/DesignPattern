# PrototypePattern

原型模式（Prototype Pattern）的简单程度仅次于单例模式和迭代器模式，使用场景较多

原型模式先产生出一个包含大量共有信息的类，然后可以拷贝出副本，修正细节信息，建立了一个完整的个性对象

```
Specify the kinds of objects to create using a prototypical instance,and create new objects by copying this prototype
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
```

![](.\img\1.png)

优点：

```
性能优良：内存二进制流的拷贝,比直接new一个对象性能好很多,在一个循环体内产生大量的对象时,原型模式优点显著
逃避构造函数的约束：在内存中拷贝,构造函数不会执行,减少约束
```

使用场景：

```
资源优化场景：类初始化需要消化非常多的资源,数据/硬件资源等
性能和安全要求的场景：new一个对象需要非常繁琐的数据准备或访问权限
一个对象多个修改者的场景:一个对象需要提供给其他对象访问,而且各个调用者可能需要修改其值时,使用原型模式拷贝多个对象供调用者使用
原型模式配合工厂方法模式一起使用,通过clone()创建一个对象由工厂方法提供给调用者
```

通用源码：

```java
package com.dp.source_code;

public class PrototypeClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {

        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}

```

注意事项：

```
构造函数不被执行：clone()从堆内存中以二进制流的方式进行拷贝,重新分配一个内存块,不执行构造函数
使用clone(),类成员变量上不要添加final关键字
```





