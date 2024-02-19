import java.util.Scanner;

public class Experiment2_Pr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 10,000 to convert to word");
        int num = sc.nextInt();

        if (num < 0 || num > 10000) {
            System.err.println("Number must be from 0 to 10,000.");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("In words: ");
            convertToWords(num);
        }

        sc.close();
    }

    public static void convertToWords(int num) {

        String[] units = {
                "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };

        String result = "";

        if (num >= 1000) {
            result += units[num / 1000] + " thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            result += units[num / 100] + " hundred ";
            num %= 100;
        }

        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num > 0) {
            result += units[num];
        }

        System.out.println(result.trim());
    }
}
