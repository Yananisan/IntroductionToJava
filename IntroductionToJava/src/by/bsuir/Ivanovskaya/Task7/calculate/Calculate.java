package by.bsuir.Ivanovskaya.Task7.calculate;

public class Calculate {

   public static double[] calculate(int n, double[] arr){
       System.out.print("\n");
       return Sort(n, arr);
   }

   private static double[] Sort(int n, double[] arr){
       int i = 0;
       double buf;
       while (i < n - 1) {
           if(i >= 0) {
               if (arr[i] < arr[i + 1]) {
                   i++;
               } else {
                   buf = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = buf;
                   i--;
               }
           }else i = 0;
       }
       for(int j = 0; j < n; j++){
           System.out.print(arr[j] + " ");
       }
       return arr;
   }
}
