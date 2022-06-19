/*
Convert a sentence into its equivalent mobile numeric keypad sequence 
Easy Accuracy: 67.35% Submissions: 5637 Points: 2
Lamp
This problem is part of GFG SDE Sheet. Click here to view more.   
Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence.



 

Example 1:

Input:
S = "GFG"
Output: 43334
Explanation: For 'G' press '4' one time.
For 'F' press '3' three times.
Example 2:

Input:
S = "HEY U"
Output: 4433999088
Explanation: For 'H' press '4' two times.
â€‹For 'E' press '3' two times. For 'Y' press '9' 
three times. For white space press '0' one time.
For 'U' press '8' two times.
 

Your Task:  
You dont need to read input or print anything. Complete the function printSequence() which takes a string as input parameter and returns its equivalent mobile numeric keypad sequence as a string.
 

Expected Time Complexity: O(Length of String)
Expected Auxiliary Space: O(Length of String)
 

Constraints:

1 <= Length of String <= 105
Characters of string can be empty space or capital alphabets.
*/
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        String s="";
        for(int x=0;x<S.length();x++){
            char ch=S.charAt(x);
            switch(ch){
                case 'A':
                    s=s+'2';
                    break;
                case 'B':
                    s=s+"22";
                    break;
                case 'C':
                    s=s+"222";
                    break;
                case 'D':
                    s=s+"3";
                    break;
                case 'E':
                    s=s+"33";
                    break;
                case 'F':
                    s=s+"333";
                    break;
                case 'G':
                    s=s+"4";
                    break;
                case 'H':
                    s=s+"44";
                    break;
                case 'I':
                    s=s+"444";
                    break;
                case 'J':
                    s=s+"5";
                    break;
                case 'K':
                    s=s+"55";
                    break;
                case 'L':
                    s=s+"555";
                    break;
                case 'M':
                    s=s+"6";
                    break;
                case 'N':
                    s=s+"66";
                    break;
                case 'O':
                    s=s+"666";
                    break;
                case 'P':
                    s=s+"7";
                    break;
                case 'Q':
                    s=s+"77";
                    break;
                case 'R':
                    s=s+"777";
                    break;
                case 'S':
                    s=s+"7777";
                    break;
                case 'T':
                    s=s+"8";
                    break;
                case 'U':
                    s=s+"88";
                    break;
                case 'V':
                    s=s+"888";
                    break;
                case 'W':
                    s=s+"9";
                    break;
                case 'X':
                    s=s+"99";
                    break;
                case 'Y':
                    s=s+"999";
                    break;
                case 'Z':
                    s=s+"9999";
                    break;
                case ' ':
                    s=s+"0";
                    break;
                
            }
        }
        return s;
    }
}
