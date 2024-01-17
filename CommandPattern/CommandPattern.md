# CommandPattern 

高内聚模式

```
Encapsulate a request as an object,thereby letting you parameterize clients with different requests,queue or log requests,and support undoable operations
将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化,对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能
```

```
CommandPattern由三部分组成：
Receive接收者角色：干活的角色,命令传递到这里是应该被执行的 eg:三个具体的group类
Command命令角色：需要执行的所有命令都在这里声明
Invoker调用者角色：接收到命令，并执行命令 eg：Invoker
```

通用源码：

```java
public abstract class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
```

```java
public class ConcreteReciver1 extends Receiver{
    //每个接收者都必须处理一定的业务逻辑
    public void doSomething(){
    }
}
public class ConcreteReciver2 extends Receiver{
    //每个接收者都必须处理一定的业务逻辑
    public void doSomething(){
    }
}
```

```java
public abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
```

```java
public class ConcreteCommand1 extends Command {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand1(Receiver _receiver){
        this.receiver = _receiver;
    }
    //必须实现一个命令
    public void execute() {
//业务处理
        this.receiver.doSomething();
    }
}
public class ConcreteCommand2 extends Command {
    //哪个Receiver类进行命令处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver){
        this.receiver = _receiver;
    }
    //必须实现一个命令
    public void execute() {
//业务处理
        this.receiver.doSomething();
    }
}
```

```java
public class Invoker {
    private Command command;
    //受气包，接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
```

```java
public class Client {
    public static void main(String[] args) {
		//首先声明调用者Invoker
        Invoker invoker = new Invoker();
		//定义接收者
        Receiver receiver = new ConcreteReciver1();
		//定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
		//把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
```

通用类图：

![](.\img\4.png)

优点：

```
类间解耦：调用者与接收者角色之间没有任何依赖关系,调用者实现某个功能时只需调用Command的execute()即可,不需要了解底层是哪个接收者执行
可扩展性：Command的子类易扩展,invoker和高层次的模块Client不产生严重的代码耦合
可结合其他设计模式一起使用：责任链模式,实现命令族解析任务;模板方法模式,减少Command子类的膨胀问题
```

缺点：

```
若有N个命令,则有N个Command子类,类会膨胀的非常大,在开发中慎重考虑使用
```

使用场景：

```
只要认为是命令的地方就可以采用命令模式
eg：
	GUI开发,一个按钮的点击是一个命令;
	模拟DOS命令时,命令模式;
	触发-反馈机制的处理等
```

未使用设计模式

![](.\img\1.png)





使用设计模式（初稿）

![](.\img\2.png)

使用设计模式（终稿）

![](.\img\3.png)

