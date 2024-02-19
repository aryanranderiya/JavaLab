public class Experiment3_Pr5 {

    int a,b;

    Experiment3_Pr5(int x, int y){
        a=x;
        b=y;
    }

    public static void sum(Experiment3_Pr5 obj){
        int sum = obj.a + obj.b;
        System.out.println("Addition of " + obj.a + " and " + obj.b + " is " + sum );
    }

    public static void main(String[] args) {
        Experiment3_Pr5 obj = new Experiment3_Pr5(10, 20);;
        sum(obj);
    }
}
