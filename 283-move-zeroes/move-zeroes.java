import java.util.ArrayList;
class Solution {
    public void moveZeroes(int[] nums) {

      // diff method with pointer
      // we will use the ponter and then itreate  thsat pointer for  the nonzero and then the zero as well


      // int nums[] given


      int nzp = 0; // Non Zero Pointer

      for(int i=0;i<nums.length;i++){
           
           if(nums[i]!=0){
            
            nums[nzp]=nums[i];
            nzp++;
           }
      }


      // now setting out the zeros
     

      while(nzp<nums.length){
        
        nums[nzp]=0;
        nzp++;
      }


      

         






        
    }
}