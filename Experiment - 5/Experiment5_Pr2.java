class X {
    public void method() {
        System.out.println("X class method (overriden)");
    }
}

class Y extends X {
    public void method() {
        System.out.println("y class method (overriden)");
    }
}

class Z extends Y {
    public void method() {
        System.out.println("Z class method");
    }
}

public class Experiment5_Pr2 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        X reference;

        reference = x;
        reference.method();

        reference = y;
        reference.method();

        reference = z;
        reference.method();
    }
}
