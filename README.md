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

    Java 动态代理允许在运行时动态地创建代理对象，对类的行为进行拦截和修改。具体的拦截行为在InvocationHandler接口的实现类中定义，通过重写invoke方法来实现。invoke方法在代理对象调用目标方法时会被执行