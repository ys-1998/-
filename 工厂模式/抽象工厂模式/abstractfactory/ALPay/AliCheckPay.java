package factory.abstractfactory.ALPay;

import factory.abstractfactory.CheckPay;

public class AliCheckPay implements CheckPay {
    @Override
    public void checkPayOrder() {
        System.out.println("支付宝，查询成功：abstractfactory");
    }
}
