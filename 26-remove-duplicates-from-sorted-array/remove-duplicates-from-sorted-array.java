class Solution {
    public int removeDuplicates(int[] nums) {

   int i = 0;

   int j = 1;  

   int k = 1;


     while(j!=nums.length){

     // duplicate element found
     if(nums[i]==nums[j]){
        j++;
     }

     // unique element found
     else{
        nums[k]=nums[j];
        j++;
        i++;
        k++;
     }

     }

      return k;





    }

    

   


}