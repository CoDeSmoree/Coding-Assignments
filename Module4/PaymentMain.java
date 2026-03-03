package Module4;
//Create an interface Payment with method pay(). Implement it in CreditCardPayment
//and UPIPayment classes
interface Payment{
    public void pay();
}
class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Made payment through UPI.");
    }
}

class CreditCardPayment implements Payment{
    public void pay(){
        System.out.println("Made payment through credit card");
    }
}
public class PaymentMain {
    public static void main(String[] args) {
        Payment upi= new UPIPayment();
        Payment cc=new CreditCardPayment();
        upi.pay();
        cc.pay();
    }
}
