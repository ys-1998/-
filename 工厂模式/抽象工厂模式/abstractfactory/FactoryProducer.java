package factory.abstractfactory;

import factory.abstractfactory.ALPay.AliPayFactory;
import factory.abstractfactory.WechatPay.WechatPayFactory;


/**
 * 超级工厂类（简单工厂），根据入参生成对应的工厂
 */
public class FactoryProducer {


    private FactoryProducer(){}

    public static OrderFactory getFactory(String type){
        if (type.equalsIgnoreCase("")){
            return null;
        }else if (type.equalsIgnoreCase("WECHAT")){
            OrderFactory wechatPayFactory = new WechatPayFactory();
            return wechatPayFactory;
        }else if (type.equalsIgnoreCase("ALI")){
            OrderFactory aliPayFactory = new AliPayFactory();
            return aliPayFactory;
        }
        return null;
    }
}
