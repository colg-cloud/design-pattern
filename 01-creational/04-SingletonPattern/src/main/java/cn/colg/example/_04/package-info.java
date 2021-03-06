/**
 * 单例模式 （四）
 * 
 * <pre>
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；
 * 懒汉式单例类线程安全控制烦琐，而且性能受影响。
 * 
 * 可见，无论是饿汉式单例还是懒汉式单例都存在这样那样的问题，有没有一种方法，能够将两种单例的缺点都克服，而将两者的优点合二为一呢？
 * 
 *  答案是：Yes！可以使用 Initialization Demand Holder (IoDH)的技术。
 *  
 * 通过使用IoDH，既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）。
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._04;