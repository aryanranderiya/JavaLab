import java.util.Scanner;

public class Experiment3_Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String e_Name = sc.nextLine();

        System.out.println("Enter Employee ID:");
        String e_ID = (String) sc.nextLine();

        System.out.println("Enter Employee E-Mail:");
        String e_Email = sc.nextLine();

        System.out.println();
        System.out.println("Employee ID: "+e_ID);
        System.out.println("Employee Name: "+e_Name);
        System.out.println("Employee E-Mail: "+e_Email);
        System.out.println();

        sc.close();
    }
}
