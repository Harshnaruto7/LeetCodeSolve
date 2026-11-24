class Solution {
    public int arraySign(int[] nums) {

         int count = 1;


        for (int i = 0; i < nums.length; i++) {


            if(nums[i] == 0){

                count = 0;

                break;

            }

            if(nums[i] < 0){

                int temp = -1;

                count = count * temp;


            }



        }

      return count;



        
    }
}