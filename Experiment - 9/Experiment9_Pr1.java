import java.util.*;

class Experiment9_Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for division:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number for division:");
        int number2 = sc.nextInt();

        try {
            System.out.printf("Division of %d and %d is: ", number1, number2, number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero!");
        }
        sc.close();
    }
}