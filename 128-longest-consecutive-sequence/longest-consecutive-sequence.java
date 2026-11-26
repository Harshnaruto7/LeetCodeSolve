class Solution {
    public int longestConsecutive(int[] nums) {


        if(nums.length == 0){

            return 0;
        }

         int longest = 1;
        int current = 1;


        ArrayList<Integer> list1 = new ArrayList<>();


        Arrays.sort(nums);

        // ascending order it goes


        for (int i = 1; i < nums.length; i++) {


            // we need to check first the sequence , then first occurrence

            if(nums[i] - nums[i-1] == 1){

               current++;

            }

            else if(nums[i] == nums[i-1]){

                // We don't need to do something

            }

            else {

                current = 1;

            }

            longest = Math.max(longest,current);



        }

        return longest;



        
    }
}