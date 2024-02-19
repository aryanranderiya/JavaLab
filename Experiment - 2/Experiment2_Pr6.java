import java.util.Scanner;

public class Experiment2_Pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit to print prime numbers");
        int n = sc.nextInt();

        if(n==0 || n==1) {
            System.out.println("No Prime numbers found until "+ n);
            System.exit(0); 
        }
        else{
            System.out.println("Printing Prime numbers until " + n);
            for (int i=1; i<=n;i++){
                if (isPrime(i)){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
    public static boolean isPrime(int number){

        if (number == 2) return true;
        
        for(int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
