final class Superclass {

    // final class cannot be extended.

    public void method() {
        System.out.println("Overriden Method of super class");
    }
}

public class Experiment4_Pr4 extends Superclass {

    final static int NUMBER = 10;

    // final method cannot be overriden

    public void method() {

        // final value cannot be changed

        NUMBER = 20;
        System.out.println("Method of sub class");
    }

    public static void main(String[] args) {
        Experiment4_Pr4 obj = new Experiment4_Pr4();
        obj.method();
    }

}
