/*
Replace O's with X's 
Medium Accuracy: 45.14% Submissions: 4756 Points: 4
Given a matrix mat of size N x M where every element is either ‘O’ or ‘X’.
Replace all ‘O’ with ‘X’ that are surrounded by ‘X’.
A ‘O’ (or a set of ‘O’) is considered to be by surrounded by ‘X’ if there are ‘X’ at locations just below, just above, just left and just right of it.

Example 1:

Input: n = 5, m = 4
mat = {{'X', 'X', 'X', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'O', 'O', 'X'}, 
       {'X', 'O', 'X', 'X'}, 
       {'X', 'X', 'O', 'O'}}
Output: ans = {{'X', 'X', 'X', 'X'}, 
               {'X', 'X', 'X', 'X'}, 
               {'X', 'X', 'X', 'X'}, 
               {'X', 'X', 'X', 'X'}, 
               {'X', 'X', 'O', 'O'}}
Explanation: Following the rule the above 
matrix is the resultant matrix. 
Your Task:
You do not need to read input or print anything. Your task is to complete the function fill() which takes n, m and mat as input parameters ad returns a 2D array representing the resultant matrix.

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

Constraints:
1 ≤ n, m ≤ 500
*/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int x=0;x<n;x++){
            int y=0;
            if(a[x][y]=='O')
            sap(a,x,y,n,m);
            
            y=m-1;
            if(a[x][y]=='O')
            sap(a,x,y,n,m);
        }
        
        for(int y=0;y<m;y++){
            int x=0;
            if(a[x][y]=='O')
            sap(a,x,y,n,m);
            x=n-1;
            if(a[x][y]=='O')
            sap(a,x,y,n,m);
        }
        
        for(int x=0;x<n;x++){
            for(int y=0;y<m;y++){
                if(a[x][y]=='B')
                a[x][y]='O';
                else if(a[x][y]=='O')
                a[x][y]='X';
            }
        }
        return a;
    }
    
    static void sap(char a[][],int x,int y,int n,int m){
        if(x<0 || y<0 || x>=n || y>=m)
        return;
        
        if(a[x][y]!='O')
        return;
        
        a[x][y]='B';
        
        sap(a,x+1,y,n,m);
        sap(a,x,y+1,n,m);
        sap(a,x-1,y,n,m);
        sap(a,x,y-1,n,m);
    }
}
