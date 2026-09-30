class Solution {
    public int[] concatWithReverse(int[] nums) {
      

      int len = nums.length;


      int ans[] = new int[len * 2];


      // first half

      for(int i=0; i < len; i++){
          

          ans[i] = nums[i];


      }


      // second half


      for(int i = 0; i < len ; i++){
       
       ans[len + i] = nums[len - i - 1];

      }



      return ans;






        
    }
}