package factory.methodfactory;

public class AlPay implements Pay {
    @Override
    public void pay() {
        System.out.println("支付宝支付成功");
    }

    @Override
    public void checkPay() {

    }

    @Override
    public void refund() {

    }
}
