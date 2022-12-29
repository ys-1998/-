package factory.abstractfactory.WechatPay;

import factory.abstractfactory.CheckPay;

public class WechatCheckPay implements CheckPay {
    @Override
    public void checkPayOrder() {
        System.out.println("微信支付，查询成功：abstractfactory");
    }
}
