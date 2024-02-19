public class Experiment2_Pr12 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrix3 = new int[3][3];

        System.out.println("Matrix 1:");

        for(int x=0;x<3;x++){    
            for(int y=0;y<3;y++){
                System.out.print(matrix1[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");

        for(int x=0;x<3;x++){    
            for(int y=0;y<3;y++){
                System.out.print(matrix2[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix 3:");

        for(int x=0;x<3;x++){    
            for(int y=0;y<3;y++){
                matrix3[x][y] = matrix1[x][y] + matrix2[x][y];
                System.out.print(matrix3[x][y]+" ");
            }
            System.out.println();
        }
    }   
}