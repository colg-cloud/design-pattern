package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类 - 数据库操作1
 *
 * @author colg
 */
@Slf4j
public class DbOperation01Adapter implements DbOperation {
    
    /** 定义适配者类对象 */
    private Crypoto crypoto = new Crypoto();

    @Override
    public void add(String data) {
        log.info("添加的数据 : {}", data);
        data = crypoto.md5(data);
        log.info("加密后的数据 ： {}", data);
    }
}
