package cn.colg.example._04;

import cn.colg.example._03.AbstractComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 采购单
 *
 * @author colg
 */
@Slf4j
public class PurchaseRequest extends AbstractComponent {

    @Override
    public void display() {
        log.info("采购单的显示功能");
    }
}
