# 设计模式Java版

## 1. 设计模式概述

**设计模式（Design Pattern）**：代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方法是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。

**使用设计模式的目的**：为了代码可重用性，让代码更容易被他人理解，保证代码可靠性。设计模式使代码编写真正工程化；设计模式是软件工程的基石脉络，如同大厦的结构一样。

## 2. 面向对象设计模式原则

**总原则——开闭原则（Open-Closed Principle, OCP）**
对扩展开放，对修改封闭。在程序需要进行扩展的时候，不能去修改原有的代码，而是要扩展原有代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和开发。想要达到这样的效果，我们需要使用接口和抽象类等。

1、**单一职责原则（Single Responsibility Principle, SRP)）**
不要存在多于一个导致类变更的原因，也就是说每个类应该实现单一的职责，否则就应该把类拆分。

2、**里氏替换原则（Liskov Substitution Principle）**
任何基类可以出现的地方，子类一定可以出现。里式替换原则是继承复用的基石，只有当衍生类可以替换基类，软件单位的功能不受影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。
里氏替换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏替换原则是对实现抽象化的具体步骤的规范。里氏替换原则中，子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。

3、**依赖倒转原则（Dependence Inversion Principle）**
面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互。

4、**接口隔离原则（Interface Segregation Principle）**
每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。使用多个隔离的接口，比使用单个接口（多个接口方法集合到一个的接口）要好。

5、**迪米特法则（最少知道原则）（Demeter Principle）**
一个类对自己依赖的类知道的越少越好。无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。

6、**合成复用原则（Composite Reuse Principle）**
尽量使用对象组合，而不是继承来达到复用的目的。

## 3. 设计模式分类

**设计模式分为三种类型，共24类**

- 创建型模式（六个）
  - 简单工厂模式，工厂方法模式，抽象工厂模式，单例模式，原型模式，建造者模式。
- 结构型模式（七个）
  - 适配器模式，桥接模式，组合模式，装饰模式，外观模式，享元模式，代理模式。
- 行为型模式（十一个）
  - 责任链模式，策略模式，模版方法模式，观察者模式，迭代器模式，命令模式，备忘录模式，状态模式，访问者模式，终结者模式，解释器模式。

## 4. 参考文档

- 设计模式Java版本（[设计模式Java版](https://gof.quanke.name/) - [GitHub](https://github.com/quanke/design-pattern-java)）
- 设计模式的三种类型（[设计模式的三种类型](https://blog.csdn.net/cyjch/article/details/51506525)）
- 23种设计模式汇总整理（[23种设计模式汇总整理](https://blog.csdn.net/jason0539/article/details/44956775)）