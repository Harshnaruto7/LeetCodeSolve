class Solution {
    public int differenceOfSum(int[] nums) {
      
      // element and digit sum


      // elemnt sum 

      int sum1 = 0;

      for(int i=0; i < nums.length; i++){
        
        sum1 = sum1 + nums[i];



      }

      // digit sum

      int sum2 = 0;


      for(int i = 0; i < nums.length; i++){
         
         // getting digits 

         while(nums[i] > 0){ // till it become zero


           // get the last digit

           int digit = nums[i] % 10; 

           // adding it every last digit

           sum2 = sum2 + digit;

           // removing the last digit and getting the new one 

           nums[i] = nums[i] / 10;



         }

      }



         // the difference 

         int diff = sum1 - sum2;



         return diff;


 






        
    }
}