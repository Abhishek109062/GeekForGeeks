// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
   public static ArrayList<Integer> duplicates(int arr[], int n) {
       // code here
       Arrays.sort(arr);
       HashSet<Integer> h = new HashSet<Integer>();
       for(int i=0;i<n-1;i++)
       {
           if(arr[i]==arr[i+1])
              h.add(arr[i]);
       }
       ArrayList<Integer> l = new ArrayList<Integer>(h);
       Collections.sort(l);
       if(l.size()==0)
       {
           l.add(-1);
           return l;
       }
       return l;
   }
}
