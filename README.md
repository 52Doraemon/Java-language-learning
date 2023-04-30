# Java-language-learning
Java language learning

# java动态代理dynamicproxy
为什么需要代理？

    代理可以无侵入式的给代码对象增强其他的功能

代理长什么样子？

    代理里面就是对象要被代理的方法

Java通过什么来保证代理的样子？

    通过接口保证，对象和代理需要实现同一个接口，接口中就是被代理的所有的方法

如何为Java对象创建一个代理对象

    java.lang.reflect.Proxy类：提供了为对象产生代理的方法

案例：为明星对象创建代理