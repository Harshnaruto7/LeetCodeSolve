class Solution {
    public int[] productExceptSelf(int[] nums) {



       int ans[] = new int[nums.length];



       // calculate the product of everything on left
        // go right check


        int leftProduct = 1;


        for (int i = 0; i < nums.length; i++){

            // ans
            ans[i] = leftProduct;

            // left product
            leftProduct = leftProduct * nums[i];
        }


        // calculate everything that is on the right
        // go left check right


        int rightProduct = 1;


        for (int j = nums.length-1; j >= 0; j--){


            // getting the answer by getting the product of left and right
            ans[j] = ans[j] * rightProduct;
            
            rightProduct = rightProduct * nums[j];

        }

        return ans;
        
    }
}