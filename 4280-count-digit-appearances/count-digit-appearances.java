class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {


       

       int appearances = 0;


        for (int i = 0; i < nums.length; i++){

            // checking for the digit if it appears there

            // int digit = nums % 10;
            // sum = sum + digit;
            // nums = nums / 10;

            while( nums[i] > 0){


                if(nums[i] % 10 == digit){

                    appearances++;


                }

                nums[i] = nums[i] / 10;

            }
            
        }

        return appearances;
        



        
    }
}