class Solution {
    public int removeElement(int[] nums, int val) {

        // whatever the value is given we need to remove the vlaue from the arr
           
           int count = 0;

           int k = 0;

        for(int i=0;i<nums.length;i++){
           
           if(nums[i]!=val){
              count++;

              nums[k]=nums[i];
              k++;

           }



        }


        return count;



        
    }
}