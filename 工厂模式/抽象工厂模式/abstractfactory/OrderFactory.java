package factory.abstractfactory;

public interface OrderFactory {
    Pay creatPay();
    Refund createRefund();
    CheckPay creatCheckPay();
}
