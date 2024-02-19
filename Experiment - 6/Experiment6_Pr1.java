abstract class Abstractclass {
    abstract void method(); // method declaration
}

public class Experiment6_Pr1 extends Abstractclass {

    public static void main(String[] args) {
        Experiment6_Pr1 obj = new Experiment6_Pr1();
        obj.method();
    }

    void method() {
        System.out.println("This is body of abstract method of abstract class");
    }
}
