package by.bsuir.Ivanovskaya.Task6.calculate;

public class Calculate {

   public static double[][] calculate(int n, double[] arr){
       System.out.print("\n");
       return TableBuild(n, arr);
   }

   private static double[][] TableBuild (int n, double[] arr){
       double[][] arr2 = new double[n][n];
       double[][] matrix = new double[n][n];
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               if(j <= n - i - 1){
                   arr2[i][j] = arr[i + j];
               }else{
                   arr2[i][j] = arr[i + j - n];
               }
               System.out.print(arr2[i][j] + " ");
               matrix[i][j] = arr2[i][j];

           }
           System.out.print("\n");
       }
       return matrix;
   }
}
