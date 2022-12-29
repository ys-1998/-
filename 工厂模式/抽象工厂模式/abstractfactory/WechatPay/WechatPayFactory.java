package factory.abstractfactory.WechatPay;

import factory.abstractfactory.CheckPay;
import factory.abstractfactory.OrderFactory;
import factory.abstractfactory.Pay;
import factory.abstractfactory.Refund;

public class WechatPayFactory implements OrderFactory {
    @Override
    public Pay creatPay() {
        return new WechatPay();
    }

    @Override
    public Refund createRefund() {
        return new WechatRefund();
    }

    @Override
    public CheckPay creatCheckPay() {
        return new WechatCheckPay();
    }
}
