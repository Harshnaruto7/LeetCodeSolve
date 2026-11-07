class Solution {
    public int smallestRangeI(int[] nums, int k) {


        int smallest = nums[0];

        int heighest = nums[0];


        for(int i : nums){

            smallest = Math.min(i,smallest);
            heighest = Math.max(i,heighest);

        }


        int result = Math.max(0,(heighest-smallest) - (2*k));


       return result;
        
    }
}