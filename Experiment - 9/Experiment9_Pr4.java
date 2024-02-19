class UserDefinedException extends Exception {
    UserDefinedException() {
        System.out.println("User Defined Exception Constructor Called!");
    }

    public void printMessage() {
        System.out.println("Printed Custom Error Message!");
    }
}

public class Experiment9_Pr4 {
    public static void main(String[] args) {

        try {
            throw new UserDefinedException();
        } catch (UserDefinedException e) {
            System.out.println("User Defined Exception caught!");
            e.printMessage();
        }
    }
}
