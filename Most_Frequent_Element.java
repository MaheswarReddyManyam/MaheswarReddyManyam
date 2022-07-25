/*Most Frequent Element*/

import java.util.*;
public class Source {
 public static int mostFrequentElement(int[] arr) {
   // Write code here
   int maxFreq=0;
        int mostFreqElement = -1;
        for(int i=0;i<arr.length;i++){
            int count=-1;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) count++;
            }
            if(count>maxFreq){
                maxFreq=count;
                mostFreqElement=arr[i];
            }
        }
        return mostFreqElement;
 }
 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
 }
}
