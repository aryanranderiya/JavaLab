public class Experiment2_Pr11 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,3,5,6};
        int max = arr1[0];
        System.out.println("Elements of Array are: ");
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
            if (max < arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println("Maximum number in array is: " + max);
    }
}
