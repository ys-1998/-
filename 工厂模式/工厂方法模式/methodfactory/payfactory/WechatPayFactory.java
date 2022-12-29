package factory.methodfactory.payfactory;

import factory.methodfactory.Pay;
import factory.methodfactory.WechatPay;

public class WechatPayFactory implements MethodFactory {
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
