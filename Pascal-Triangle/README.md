# Pascal's Triangle
Difficulty: EASY
Contributed By
Dhruv Sharma
|
Level 1
Avg. time to solve
20 min
Success Rate
80%
Problem Statement
You are given an integer N. Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.
A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.

For example, given integer N= 4 then you have to print.
1  
1 1 
1 2 1 
1 3 3 1

Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
Input Format :
The first line of input contains an integer ‘T’ denoting the number of test cases.
The first line of each test case contains a single integer N denoting the row till which you have to print the pascal’s triangle.
Output Format :
For each test case, return the 2-D array/list containing the pascal’s triangle till the row N.
Note:
You do not need to print anything; it has already been taken care of. Just implement the given function.
## Constraints:
1 <= T <= 40
1 <= N <= 50

Time Limit: 1 sec
## Sample Input 1 :
3
1
2
3
Sample Output 1 :
1
1 
1 1 
1 
1 1 
1 2 1 
Explanation Of The Sample Input 1:
For the first test case:
The given integer N = 1 you have to print the triangle till row 1 so you just have to output 1.

For the second test case:
The given integer N = 2 you have to print the triangle till row 2 so you have to output 
1
1 1

For the third test case
The given integer N = 3 you have to print the triangle till row 3 so you have to output 
1
1 1
1 2 1
Sample Input 2 :
3
4
5
6
Sample Output 2 :
1 
1 1 
1 2 1
1 3 3 1 
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
1 5 10 10 5 1
