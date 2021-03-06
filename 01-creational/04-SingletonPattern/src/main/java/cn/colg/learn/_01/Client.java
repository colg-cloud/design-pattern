package cn.colg.learn._01;

import cn.colg.learn._01.singleton.EagerSingleton;
import cn.colg.learn._01.singleton.IodhSingleton;
import cn.colg.learn._01.singleton.LazySingleton;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1, eagerSingleton2;
        eagerSingleton1 = EagerSingleton.getInstance();
        eagerSingleton2 = EagerSingleton.getInstance();
        log.info("单例模式 - 饿汉式 : {}", eagerSingleton1 == eagerSingleton2);

        LazySingleton lazySingleton1, lazySingleton2;
        lazySingleton1 = LazySingleton.getInstance();
        lazySingleton2 = LazySingleton.getInstance();
        log.info("单例模式 - 懒汉式 : {}", lazySingleton1 == lazySingleton2);

        IodhSingleton iodhSingLeton1, iodhSingLeton2;
        iodhSingLeton1 = IodhSingleton.getInstance();
        iodhSingLeton2 = IodhSingleton.getInstance();
        log.info("单例模式 - IoDH : {}", iodhSingLeton1 == iodhSingLeton2);
    }
}
