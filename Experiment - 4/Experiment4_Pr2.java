class Pr2_Parent {
    public void method() {
        System.out.println("Method of Parent Class");
    }
}

public class Experiment4_Pr2 extends Pr2_Parent {

    public void method() {
        System.out.println("Method of Child Class");
    }

    public static void main(String[] args) {
        Experiment4_Pr2 obj = new Experiment4_Pr2();
        obj.method();
    }
}
