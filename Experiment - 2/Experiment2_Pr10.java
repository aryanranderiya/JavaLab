public class Experiment2_Pr10 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];

        System.out.println("Elements of Array 1: ");
        for(int i=0; i<arr1.length;i++){
             System.out.println(arr1[i]);
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of Array 2: ");
        for(int j=0; j<arr1.length;j++){
            arr2[j] = arr1[j];
            System.out.println(arr2[j]);
        }
    }
}
