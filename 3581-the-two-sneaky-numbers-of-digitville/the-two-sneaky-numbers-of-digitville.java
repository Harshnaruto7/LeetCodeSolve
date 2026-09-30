class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      


      int sol[] = new int[2];

      int k = 0;

       
       // sort

       Arrays.sort(nums);



       for(int i =1; i < nums.length; i++){
         
          
           if(nums[i] == nums[i-1]){
              
              sol[k] = nums[i];
              k++;


           }



       }


       return sol;
      







        
    }
}