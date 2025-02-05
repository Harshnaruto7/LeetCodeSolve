class Solution {
    public int missingNumber(int[] nums) {

    // sorting the elemenet in the  correct place first
    // then checking each itration with i as given [0,n]


    // sorting 
    // bubble sort

    for(int i=0;i<nums.length;i++){
      
      int temp =0;

      for(int j=0;j<nums.length-i-1;j++){
         
         if(nums[j]>nums[j+1]){
           
           // swap
           
           temp = nums[j];
           nums[j]=nums[j+1];
           nums[j+1]=temp;
         }
      }

        
       





    }


     // aftering sorting the  element 
        // checking for the elemenet

        // checking

        int missing =0;
        
        for(int p=0;p<nums.length;p++){
          
          if(nums[p]!=p){
           
           System.out.println("Missing element is "+ p);

           missing =p;

           return p;


          }


        }


      
   





  return nums.length;
       


    }
        
    
}