class A{
    public void method(){
        System.out.println("A class method.");
    }
}

class B extends A{
    public void method(){
        System.out.println("B class method.");
    }
}

public class Experiment5_Pr1 {
    public static void main(String[] args){
        A obja = new A();
        B objb = new B();

        A reference;

        // call to overriden method of parent class.
        reference = obja;
        reference.method();

        reference = objb;
        reference.method();
    }    
}
