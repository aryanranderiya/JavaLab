import java.util.Random;
import java.util.Scanner;

public class Experiment2_Pr8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower range");
        int l_range = sc.nextInt();
        System.out.println("Enter an upper range");
        int u_range = sc.nextInt();

        Random r = new Random();
        int generated_int = r.nextInt(l_range,u_range);
        System.out.println("Random number: " + generated_int);
        sc.close();
    }
}
