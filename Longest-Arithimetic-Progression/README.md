# Longest Arithmetic Progression 
Medium Accuracy: 42.21% Submissions: 5496 Points: 4
Given an array called A[] of sorted integers having no duplicates, find the length of the Longest Arithmetic Progression (LLAP) in it.


## Example 1:

Input:
N = 6
set[] = {1, 7, 10, 13, 14, 19}
Output: 4
Explanation: The longest arithmetic 
progression is {1, 7, 13, 19}.
Example 2:

Input:
N = 5
A[] = {2, 4, 6, 8, 10}
Output: 5
Explanation: The whole set is in AP.

Your Task:
You don't need to read input or print anything. Your task is to complete the function lenghtOfLongestAP() which takes the array of integers called set[] and n as input parameters and returns the length of LLAP.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)

## Constraints:
1 ≤ N ≤ 1000
1 ≤ set[i] ≤ 104
