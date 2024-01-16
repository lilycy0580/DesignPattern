# 建造者模式 BuilderPattern

建造者模式，也即生成器模式

```
Separate the construction of a complex object from its representation so that the same construction process can create different representations
将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示
```

```
建造者模式由4部分组成：
1.Product:通常是实现了模板方法模式,有模板方法与基本方法  eg：BenzModel和BMWModel
2.Builder:抽象建造者 规范产品的组建,一般是由子类实现  eg: CarBuilder
3.ConcreteBuilder:实现抽象类定义的所有方法,并且返回一个组建好的对象  eg:BenzBuilder与BMWBuilder
4.Director:负责安排已有模块的顺序,然后告诉Builder开始建造
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
便于控制细节风险：具体的建造者是独立的,因此可以对建造过程逐步细化而不对其他的模块产生影响
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

Code:

```java
package com.dp.book2.use_pattern.product;

import java.util.ArrayList;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

    // 行车
    protected abstract void start();

    // 泊车
    protected abstract void stop();

    // 鸣笛
    protected abstract void alarm();

    // 引擎声
    protected abstract void engineBoom();

    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }
    
}

```

```java
package com.dp.book2.use_pattern.product;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engineBoom");
    }
}

```

```java
package com.dp.book2.use_pattern.product;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engineBoom");
    }
}

```

```java
package com.dp.book2.use_pattern.builder;



import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}

```

```java
package com.dp.book2.use_pattern.builder.ConcreteBuilder;


import com.dp.book2.use_pattern.builder.CarBuilder;
import com.dp.book2.use_pattern.product.BenzModel;
import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }


}

```

```java
package com.dp.book2.use_pattern.builder.ConcreteBuilder;


import com.dp.book2.use_pattern.builder.CarBuilder;
import com.dp.book2.use_pattern.product.BMWModel;
import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();
    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }
}

```

```java
package com.dp.book2.use_pattern.director;



import com.dp.book2.use_pattern.builder.ConcreteBuilder.BMWBuilder;
import com.dp.book2.use_pattern.builder.ConcreteBuilder.BenzBuilder;
import com.dp.book2.use_pattern.product.BMWModel;
import com.dp.book2.use_pattern.product.BenzModel;

import java.util.ArrayList;

public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    // A类型的BenzModel
    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // B类型的BenzModel
    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // C类型的BMWModel
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    // D类型的BMWModel
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

}

```

```java
package com.dp.book2.use_pattern;

import com.dp.book2.use_pattern.director.Director;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("量产A型Benz...........................");
        for (int i = 0; i < 2; i++) {
            director.getABenzModel().run();
        }
        System.out.println("量产B型Benz....................");
        for (int i = 0; i < 2; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("量产C型BMW..........");
        for (int i = 0; i < 2; i++) {
            director.getCBMWModel().run();
        }
        System.out.println("量产D型BMW.......................");
        for (int i = 0; i < 2; i++) {
            director.getDBMWModel().run();
        }
    }

}

```

# 原型模式 PrototypePattern

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
package com.dp._source_code;

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

```java
package com.dp.use_pattern;

public class AdvTemplate {

    // 广告信名称
    private String advSubject = "xxx银行国庆信用卡抽奖活动";


    // 广告信内容
    private String advContext = "国庆抽奖活动通知:只要刷卡就送一百万~~";

    public String getAdvSubject(){
        return this.advSubject;
    }

    public String getAdvContext(){
        return this.advContext;
    }

}
```

```java
package com.dp.use_pattern;

public class Mail implements Cloneable {

    // 收件人
    private String receiver;
    // 邮件名称
    private String subject;
    // 称谓
    private String appellation;
    // 邮件内容
    private String context;
    // 邮件尾部
    private String tail;
    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone()  {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    // getter与setter方法
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}

```

```java
package com.dp.use_pattern;

import java.util.Random;

public class Client {

    // 发送邮件的数量,从数据库中取值
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i=0;
        // 从数据库中获取模板
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while(i<MAX_COUNT){
            // todo 原型模式
            Mail mailClone = mail.clone();
            mailClone.setAppellation(getRandString(5)+"先生/女士");
            mailClone.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题:"+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t....发送成功！");
    }

    public static String getRandString(int maxLength){
        String source = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }
}
```

# 命令模式 Command Pattern



