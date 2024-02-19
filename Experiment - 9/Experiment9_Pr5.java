import java.util.*;

class Experiment9_Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for division:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number for division:");
        int number2 = sc.nextInt();

        try {
            int number3 = number1 / number2;
            System.out.printf("Division of %d and %d is: %d\n", number1, number2, number3);

        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero!");
        } finally {
            System.out.println("Finally block always excuted after try catch!");
        }
        sc.close();
    }
}