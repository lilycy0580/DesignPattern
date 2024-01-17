# IteratorPattern

```
Provide a way to access the elements of an aggregate object sequentially without exposing its
underlying representation
提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节
```

使用设计模式之前：

![](.\img\1.png)

使用设计模式之后：

![](.\img\2.png)

迭代器通用类图：

![](.\img\3.png)

```
Iterator抽象迭代器
负责定义访问和遍历元素的接口,3个固定方法:first()获得第一个元素,next()访问下一个元素,hasNext()是否已经访问到底部()

ConcreteIterator具体迭代器
实现迭代器接口,完成容器元素的遍历

Aggregate抽象容器
容器角色负责提供创建具体迭代器角色的接口,提供iterator()

Concrete Aggregate具体容器
具体容器实现容器接口定义的方法,创建出容纳迭代器的对象
```

抽象迭代器：

```java
public interface Iterator {
    //遍历到下一个元素
    public Object next();
    //是否已经遍历到尾部
    public boolean hasNext();
    //删除当前指向的元素
    public boolean remove();
}
```

具体迭代器：

```java
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector){
        this.vector = _vector;
    }
    //判断是否到达尾部
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return false;
        }else{
            return true;
        }
    }
    //返回下一个元素
    public Object next() {
        Object result = null;
        if(this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }
    //删除当前元素  逻辑实现：一是删除当前元素，二是当前游标指向下一个元素
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
```

抽象容器：

```java
public interface Aggregate {
    //是容器必然有元素的增加
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //由迭代器来遍历所有的元素
    public Iterator iterator();
}
```

具体容器：

```java
public class ConcreteAggregate implements Aggregate {
    //容纳对象的容器
    private Vector vector = new Vector();
    //增加一个元素
    public void add(Object object) {
        this.vector.add(object);
    }
    //返回迭代器对象
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
    //删除一个元素
    public void remove(Object object) {
        this.remove(object);
    }
}
```

场景类：

```java
public class Client {
    public static void main(String[] args) {
		//声明出容器
        Aggregate agg = new ConcreteAggregate();
		//产生对象数据放进去
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");
		//遍历一下
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

迭代器就类似于一个数据库中的游标，可以在一个容器内上下翻滚，遍历所有它需要查看的元素

注意：

```
使用迭代器将原本简单的应用复杂化了,因为在简单的应用中使用了迭代器.ArrayList实现了iterator()方法
Iterable接口只有一个方法:iterator() 目前已经有N多个接口implement与N多个接口extends 直接使用即可
```













