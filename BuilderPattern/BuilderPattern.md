# BuilderPattern

建造者模式，也即生成器模式

```
Separate the construction of a complex object from its representation so that the same construction process can create different representations
将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示
```

```
BuilderPattern由4部分组成：
1.Product:通常是实现了模板方法模式,有模板方法与基本方法  eg：BenzModel和BMWModel
2.Builder:抽象建造者 规范产品的组建,一般是由子类实现  eg: CarBuilder
3.ConcreteBuilder:实现抽象类定义的所有方法,并且返回一个组建好的对象  eg:BenzBuilder与BMWBuilder
4.Director:负责安排已有模块的顺序,然后告诉Builder开始建造(按需定制化各种模型)
```

![](.\img\1.png)

通用源码：

```java
// Product 通常它是一个组合或继承（如模板方法模式）产生的类
public class Product {
    public void doSomething(){
        // 相关业务处理逻辑
    }
}
```

```java
// Builder  抽象建造者
public abstract class Builder {

    // 设置产品的不同部分以获取不同的产品   各种零部件
    public abstract void setPart();

    // 建造产品
    public abstract Product buildProduct();
}
```

```java
// ConcreteProduct 具体建造者
public class ConcreteProduct extends Builder{

    private Product product = new Product();

    @Override
    public void setPart() {
        // 零部件内部逻辑处理
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
```

```java
// Director 封装的作用,避免高层模块深入到建造者内部的实现类
// 在建造者模式比较庞大时,导演类可以有多个
public class Director {

    private Builder builder = new ConcreteProduct();

    // 构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
```

优点：

```
封装性：建造者使客户端不必知道产品内部组成的细节
	eg：不关心每个具体的模型内部是如何实现的,产生的对象类型就是CarModel
独立,易扩展：
	eg:BenzBuilder和BMWBuilder是相互独立的,系统可扩展性强
便于控制细节风险：
	具体的建造者是独立的,因此可以对建造过程逐步细化而不对其他的模块产生影响
```

使用场景：

```
1.相同的方法，不同的执行顺序，产生不同的事件结果时
2.多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同
3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能
4.在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到时，也可以采用建造者模式封装该对象的创建过程(不推荐,设计有bug)
```

注意事项：

```
建造者模式关注的是零部件类型与装配顺序(工艺),这是与工厂方法模式最大的区别,虽同为创建型模式但侧重点不同

建造者模式最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生的对象也不同;而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关
心的

建造者模式的时候考虑一下模板方法模式
```

