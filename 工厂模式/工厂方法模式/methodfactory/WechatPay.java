package factory.methodfactory;


public class WechatPay implements Pay {

    @Override
    public void pay() {
        System.out.println("微信支付,支付成功");
    }

    @Override
    public void checkPay() {

    }

    @Override
    public void refund() {

    }
}
