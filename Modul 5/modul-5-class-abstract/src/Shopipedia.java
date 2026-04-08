public class Shopipedia {
    public static void main(String[] args) {

        ShopiPay shopiCard = new ShopiPay();

        Customer miki = new Customer(shopiCard);
        miki.deposit(10000);
        miki.pay(2000);
        miki.pay(3000);
        miki.deposit(1000);
        miki.pay(7000);

        System.out.println("------------------");

        Opo opoCard = new Opo();

        Customer dono = new Customer(opoCard);
        dono.deposit(10000);
        dono.pay(2000);
        dono.pay(3000);
        dono.deposit(1000);
        dono.pay(7000);

        System.out.println("------------------");

        Kris krisCard = new Kris();
        Customer farrel = new Customer(krisCard);
        farrel.deposit(10000);
        farrel.pay(2000);
        farrel.pay(3000);
        farrel.deposit(1000);
        farrel.pay(7000);

    }
}