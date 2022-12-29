package factory.methodfactory.payfactory;

import factory.methodfactory.AlPay;
import factory.methodfactory.Pay;

public class ALPayFactory implements MethodFactory {
    @Override
    public Pay getPay() {
        return new AlPay();
    }
}
