interface One{
    int integer1 = 10;
    void method1();
}

interface Two{
    int integer2 = 20;
    void method2();
}

class Experiment6_Pr2 implements One, Two {
    public void method1(){
        System.out.println("Implemented method of interface 1, Value of integer is: "+ integer1 );
    }

    public void method2(){
        System.out.println("Implemented method of interface 2, Value of integer is: "+ integer2 );
    }
    public static void main(String[] args){
        Experiment6_Pr2 obj = new Experiment6_Pr2();
        obj.method1();
        obj.method2();
    }
}
