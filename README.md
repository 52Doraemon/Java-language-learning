# Java-language-learning
Java language learning

# java动态代理dynamicproxy
为什么需要代理？

    代理可以无侵入式的给代码对象增强其他的功能

    动态代理是一种设计模式，它允许在运行时动态地创建和修改对象的行为，而无需直接修改原始类的代码。动态代理通常用于拦截和修改对象的方法调用，可以用于实现诸如日志记录、权限控制、事务管理等功能，而不需要改变原始类的逻辑。

    动态代理的主要优势在于它提供了一种高度灵活和可扩展的方式来处理对象的行为。这使得开发人员可以更容易地修改和扩展现有代码，而不需要对原始类进行大量更改。

    动态代理的工作原理是通过在运行时生成代理对象，代理对象实现了与目标对象相同的接口。当代理对象的方法被调用时，代理对象会将请求转发给实际的目标对象，并在转发之前或之后执行一些自定义操作。这样，可以在不修改原始类的情况下，对目标对象的行为进行拦截、修改或扩展。

    在 Java 中，动态代理主要通过 java.lang.reflect.Proxy 类和 java.lang.reflect.InvocationHandler 接口来实现。通过 Proxy.newProxyInstance() 方法可以为指定的接口创建代理对象，而 InvocationHandler 接口定义了代理对象在调用目标对象的方法时要执行的操作。要实现动态代理，需要创建一个实现了 InvocationHandler 接口的类，并重写 invoke() 方法。

代理长什么样子？

    代理里面就是对象要被代理的方法

Java通过什么来保证代理的样子？

    通过接口保证，对象和代理需要实现同一个接口，接口中就是被代理的所有的方法

如何为Java对象创建一个代理对象

    java.lang.reflect.Proxy类：提供了为对象产生代理的方法

案例：为明星对象创建代理

    Java 动态代理允许在运行时动态地创建代理对象，对类的行为进行拦截和修改。具体的拦截行为在InvocationHandler接口的实现类中定义，通过重写invoke方法来实现。invoke方法在代理对象调用目标方法时会被执行