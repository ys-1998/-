package factory.simplefactory;

public class PayFactory {
    public static Pay getPay(String payName){
        if (payName.equals("ALPay")){
            return new AlPay();
        }else if (payName.equals("WechatPay")) {
            return new WechatPay();
        }

        return null;
    }
}
