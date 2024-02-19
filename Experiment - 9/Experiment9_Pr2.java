class Experiment9_Pr2 {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[11] = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception!");
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}