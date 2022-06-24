import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> res;
        if(n1<=n2 && n1<=n3){
            res=new ArrayList<>(n1);
            for(int x=0;x<n1;x++){
                if(Arrays.binarySearch(B,A[x])>0 && Arrays.binarySearch(C,A[x])>0)
                res.add(A[x]);
            }
        }
        else if(n2<=n1 && n2<=n3){
            res=new ArrayList<>(n2);
            
            for(int x=0;x<n2;x++){
                if(Arrays.binarySearch(A,B[x])>0 && Arrays.binarySearch(C,B[x])>0)
                res.add(B[x]);
            }
        }
        else{
            res=new ArrayList<>(n3);
            
            for(int x=0;x<n3;x++){
                if(Arrays.binarySearch(A,C[x])>0 && Arrays.binarySearch(B,C[x])>0)
                res.add(C[x]);
            }
        }
        return res;
    }
}
