/**
 * 工厂方法模式（三）
 * 
 * <pre>
 * 引入IniUtil类和ini配置文件后，如果要增加新的日志记录方式，只需要执行如下几个步骤：
 * 
 *  (1) 新的日志记录器需要继承抽象日志记录器Logger；
 *  
 *  (2) 对应增加一个新的具体日志记录器工厂，继承抽象日志记录器工厂LoggerFactory，并实现其中的工厂方法createLogger()，设置好初始化参数和环境变量，返回具体日志记录器对象；
 *  
 *  (3) 修改配置文件config.ini，将新增的具体日志记录器工厂类的类名字符串替换原有工厂类类名字符串；
 *  
 *  (4) 编译新增的具体日志记录器类和具体日志记录器工厂类，运行客户端测试类即可使用新的日志记录方式，而原有类库代码无须做任何修改，完全符合“开闭原则”。
 *  
 * 通过上述重构可以使得系统更加灵活，由于很多设计模式都关注系统的可扩展性和灵活性，因此都定义了抽象层，在抽象层中声明业务方法，而将业务方法的实现放在实现层中。
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._03;