package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractCommand command = new ConcreteCommand();
        Invoker invoker = new Invoker().setCommand(command);
        invoker.call();
    }
}
