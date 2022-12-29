package factory.abstractfactory;

public class Main {
    public static void main(String[] args) {

        //支付宝支付
//        OrderFactory orderFactory = FactoryProducer.getFactory("ALI");
//        orderFactory.creatPay().payOrder();
//        orderFactory.creatCheckPay().checkPayOrder();
//        orderFactory.createRefund().refundOrder();

        //微信支付
        OrderFactory orderFactory = FactoryProducer.getFactory("WECHAT");
        orderFactory.creatPay().payOrder();
        orderFactory.creatCheckPay().checkPayOrder();
        orderFactory.createRefund().refundOrder();

    }
}
