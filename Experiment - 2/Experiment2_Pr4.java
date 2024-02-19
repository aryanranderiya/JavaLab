public class Experiment2_Pr4 {

    public static void main(String[] args) {
        swap(10,20);
    }

    public static void swap(int a,int b){
        int c;
        System.out.println("Value of a before swap:" + a);
        System.out.println("Value of b before swap:" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Value of a after swap:" + a);
        System.out.println("Value of b after swap:" + b);

    }
}
