import java.util.*;

public class Experiment2_Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Multiplication table of "+num);
        for (int i=0;i<=10;i++){
            System.out.println(num*i);
        }    
        sc.close();
    }
}
