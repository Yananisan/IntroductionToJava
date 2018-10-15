package by.bsuir.Ivanovskaya.Task5.calculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate {

   public static List<Integer> calculate(int[] arr){
       int n = arr.length;
       int[] dynamic = new int[n];
       int[] prev = new int[n];
       int[] index = new int[n];
       int count = 0;
       for (int i = 0; i < n; i++){
           int j = 0;
           while ((arr[i] >= dynamic[j]) && (j < count))
               j++;
           dynamic[j] = arr[i];
           index[j] = i;

           prev[i] = j != 0 ? index[j-1] : -1;
           if (j == count)
               count++;
       }

       List<Integer> list = new ArrayList<>();
       int i = index[count-1];
       while (i!=-1){
           list.add(arr[i]);
           i=prev[i];
       }

       Collections.sort(list);
       System.out.print(list);
       return list;
   }
}
