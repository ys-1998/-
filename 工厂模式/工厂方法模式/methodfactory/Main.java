package factory.methodfactory;

import factory.methodfactory.payfactory.ALPayFactory;
import factory.methodfactory.payfactory.MethodFactory;
import factory.methodfactory.payfactory.WechatPayFactory;

public class Main {
    public static void main(String[] args) {
        MethodFactory alPayFactory=new ALPayFactory();
        Pay apay = alPayFactory.getPay();
        apay.pay();

        MethodFactory wechatPayFactory = new WechatPayFactory();
        Pay wpay = wechatPayFactory.getPay();
        wpay.pay();
    }
}
