package factory.abstractfactory.WechatPay;

import factory.abstractfactory.Pay;

public class WechatPay implements Pay {
    @Override
    public void payOrder() {
        System.out.println("微信支付，支付成功：abstractfactory");
    }
}
