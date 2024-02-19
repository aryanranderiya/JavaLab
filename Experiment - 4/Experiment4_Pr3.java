class Superclass {
    Superclass() {
        System.out.println("Super class constructor called!");
    }
}

public class Experiment4_Pr3 extends Superclass {

    int instancevariable = 20;

    Experiment4_Pr3() {
        super();
        int localvariable = this.instancevariable;
        System.out.println("Child class constructor called!");
        System.out.println("Value of instance variable: " + localvariable);
    }

    public static void main(String[] args) {
        new Experiment4_Pr3();
    }
}
