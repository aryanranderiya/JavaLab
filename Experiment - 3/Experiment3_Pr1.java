public class Experiment3_Pr1 {



    public void method(){
        System.out.println("Method with no parameters called");
    }

    public void method(int a){
        System.out.println("Method with parameters called");
    }

    public static void main(String[] args) {
        // new Experiment3_Pr1(new Experiment3_Pr1());
        Experiment3_Pr1 one = new Experiment3_Pr1();
        one.method(1);
        one.method();
    }

}