import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int A[][])
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int limit=2*n-1,row,col;
        for(int x=1;x<=limit;x++){
            if(x<=n){
                col=x-1;
                row=0;
            }else{
                row=x-n;
                col=n-1;
            }
            while(row<n && col>=0){
                ans.add(A[row][col]);
                row++;
                col--;
            
            }
        }
        return ans;
        
    }
}
