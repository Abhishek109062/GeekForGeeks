public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
       // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       
       if (arr == null || arr.length == 0)
           return res;
       
       int n = arr.length;
   
       Arrays.sort(arr); 
   
       for (int i = 0; i < n; i++) {
       
           int target_3 = k - arr[i];
       
           for (int j = i + 1; j < n; j++) {
           
               int target_2 = target_3 - arr[j];
           
               int front = j + 1;
               int back = n - 1;
           
               while(front < back) {
               
                   int two_sum = arr[front] + arr[back];
               
                   if (two_sum < target_2) front++;
               
                   else if (two_sum > target_2) back--;
               
                   else {
                   
                       ArrayList<Integer> quad = new ArrayList<>(); 
                       quad.add(arr[i]);
                       quad.add(arr[j]);
                       quad.add(arr[front]);
                       quad.add(arr[back]);
                       res.add(quad);
                   
                       // Processing the duplicates of number 3
                       while (front < back && arr[front] == quad.get(2)) ++front;
                   
                       // Processing the duplicates of number 4
                       while (front < back && arr[back] == quad.get(3)) --back;
               
                   }
               }
               
               // Processing the duplicates of number 2
               while(j + 1 < n && arr[j + 1] == arr[j]) ++j;
           }
       
           // Processing the duplicates of number 1
           while (i + 1 < n && arr[i + 1] == arr[i]) ++i;
       
       }
       
   
       return res;
   }
