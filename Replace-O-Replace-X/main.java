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
