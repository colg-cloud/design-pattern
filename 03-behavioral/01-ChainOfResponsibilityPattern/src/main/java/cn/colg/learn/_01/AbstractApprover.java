package cn.colg.learn._01;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 抽象处理者 - 审批者类
 *
 * @author colg
 */
@Getter
@Setter
@Accessors(chain = true)
public abstract class AbstractApprover {

    /** 定义后继对象；设值注入 */
    protected AbstractApprover successor;

    /** 审批者名称；设值注入 */
    protected String name;

    /**
     * 抽象处理请假方法
     *
     * @param leave 请假条
     * @author colg
     */
    public abstract void processLeave(Leave leave);
}
