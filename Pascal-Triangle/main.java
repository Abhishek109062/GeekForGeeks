import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> obj=new ArrayList<>();
        ArrayList<Long> temp,pre=null;
        for(int x=0;x<n;x++)
        {
            temp=new ArrayList<Long>();
            for(int y=0;y<=x;y++){
                if(y==0 || y==x)
                    temp.add(1L);
                else
                    temp.add(pre.get(y)+pre.get(y-1));
            }
                pre=temp;
           
                obj.add(temp);
            
        }
        return obj;
	}
}
