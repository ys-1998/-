package factory.abstractfactory.WechatPay;

import factory.abstractfactory.Refund;

public class WechatRefund implements Refund {
    @Override
    public void refundOrder() {
        System.out.println("微信支付，退款成功：abstractfactory");
    }
}
