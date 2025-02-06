class Solution {
    public int singleNumber(int[] nums) {
       
       // usinmg the XOR approch 

       // XOR
       // a - 0 --> a
       // a-a --> 0

       // array given

       int single = 0;


       for(int i=0;i<nums.length;i++){

       single = single ^ nums[i];    // a ^ ( b ^ b ) ^ (c ^ c)

       }


       return single;


    }
}