package factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Pay alPay = PayFactory.getPay("ALPay");
        alPay.pay();
        Pay wechatPay = PayFactory.getPay("WechatPay");
        wechatPay.pay();
    }
}
