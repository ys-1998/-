package factory.abstractfactory.ALPay;

import factory.abstractfactory.Pay;

public class AliPay implements Pay {

    @Override
    public void payOrder() {
        System.out.println("支付宝，支付成功：abstractfactory");
    }
}
