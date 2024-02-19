public class Experiment9_Pr3 {
    public static void main(String[] args) {
        try {
            try {
                System.out.printf("Dividing by zero! %d", 100 / 0);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int array[] = { 1, 2, 3 };
                System.out.println(array[3]);
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Outermost Catch!");
        }
    }
}
