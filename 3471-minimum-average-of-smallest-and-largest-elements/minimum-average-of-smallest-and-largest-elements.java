class Solution {
    public double minimumAverage(int[] nums) {

          Arrays.sort(nums);

        

        ArrayList<Double> list1 = new ArrayList<>();


        // first we will take two pointer ten we get the each next element as smallest and largest

        int left = 0;

        int right = nums.length-1;


        while(left < right){



            double avg = (nums[left]+nums[right])/2.0;

            list1.add(avg);

            left++;
            right--;


        }

       

        // we need to find the smallest

        double smallest = Double.MAX_VALUE;


        for (int i = 0; i < list1.size(); i++) {

            smallest = Math.min(smallest,list1.get(i));

        }

        return smallest;




      


        
    }
}