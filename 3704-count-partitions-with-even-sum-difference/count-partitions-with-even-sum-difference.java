class Solution {
    public int countPartitions(int[] nums) {

                int sum = 0;


        for(int num : nums ){

            sum = sum + num;

        }


        int n = (sum % 2 == 0) ? nums.length - 1 : 0;


       return n;

  




        
    }
}