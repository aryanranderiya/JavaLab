import java.util.Scanner;

public class Experiment2_Pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = sc.nextLine();
        int length = input.length();
        createPattern(input, length);
        sc.close();
    }

    public static void createPattern(String input, int length) {

        int temp = length;
        for (int i = 0; i < length; i++) { // Loop for number of lines

            for (int k = temp; k >= 0; k--) { // Loop for spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // Loop for number of characters per line
                System.out.print(input.charAt(j));
                System.out.print(" ");
            }
            System.out.println();
            temp--;
        }
    }
}
