/*Find kth Largest Element in a Stream*/

import java.util.*;
public class Source {
    static int[] kthLargestElement(int[] arr, int k, int n){
        int ans[]=new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }
            else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
            if(pq.size()<k) ans[i]=-1;
            else ans[i]=pq.peek();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int stream[] = new int[n];
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }
        int[] x = kthLargestElement(stream,k,n);
        for(int y:x) {
            if(y==-1) System.out.println("None");
            else System.out.println(k + " largest number is " + y);
        }
    }
}