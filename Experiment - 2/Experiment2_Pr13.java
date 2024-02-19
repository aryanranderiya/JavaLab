public class Experiment2_Pr13 {
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

        // i -> row
        // j -> column 
        // k -> common dimension
        
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){
                matrix3[i][j]= 0;
                for(int k=0;k<3;k++){
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }   
}