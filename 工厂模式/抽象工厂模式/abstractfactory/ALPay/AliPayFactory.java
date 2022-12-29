package factory.abstractfactory.ALPay;

import factory.abstractfactory.CheckPay;
import factory.abstractfactory.OrderFactory;
import factory.abstractfactory.Pay;
import factory.abstractfactory.Refund;

public class AliPayFactory implements OrderFactory {

    @Override
    public Pay creatPay() {
        return new AliPay();
    }

    @Override
    public Refund createRefund() {
        return new AliRefund();
    }

    @Override
    public CheckPay creatCheckPay() {
        return new AliCheckPay();
    }
}
