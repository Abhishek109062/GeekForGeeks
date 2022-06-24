import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int[] ch=new int[26];
        for(int x=0;x<arr.length();x++)
            ch[arr.charAt(x)-'a']++;
            
        String s="";
        for(int x=0;x<26;x++){
            while(ch[x]-->0){
                s=s+(char)(x+'a');
            }
        }
        return s;
    }
}
