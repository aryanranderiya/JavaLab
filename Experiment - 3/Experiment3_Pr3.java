
class Account {

    public static int balance = 0;

    public void withdraw(int withd_money) {
        balance -= withd_money;
        System.out.println("Successfully withdrawed " + withd_money);
        System.out.println("Remaining balance " + balance);
    }

    public void deposit(int dep_money) {
        balance += dep_money;
        System.out.println("Successfully deposited " + dep_money);
        System.out.println("Current balance " + balance);
    }

}

class Experiment3_Pr3 extends Account {
    public static void main(String[] args) {
        Experiment3_Pr3 o = new Experiment3_Pr3();

        o.deposit(10000);
        o.deposit(10000);
        o.deposit(10000);
        o.withdraw(1000);
    }
}
