package cn.colg.example._03;

import lombok.Setter;

/**
 * 抽象类 - 抽象图像类
 *
 * @author colg
 */
public abstract class AbstractImage {

    /** 定义实现类接口对象；设值注入 */
    @Setter
    protected ImageImp imageImp;

    /**
     * 解析文件
     *
     * @param fileName 文件名
     * @author colg
     */
    public abstract void parseFile(String fileName);
}
