package factory.abstractfactory.ALPay;

import factory.abstractfactory.Refund;

public class AliRefund implements Refund {
    @Override
    public void refundOrder() {
        System.out.println("支付宝，退款成功：abstractfactory");
    }
}
