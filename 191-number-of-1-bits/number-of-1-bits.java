class Solution {
    public int hammingWeight(int n) {
         
         // using Brain Algo 
         // To find Hamming weight
         // number of ones


         // number given

         // count val  to for the number of 1

         //  bitwise and (&)
         // n & (n-1)


         int count = 0;

         while(n!=0){
          
          n = n & (n-1);

          count++;
      
         }

         return count;






        
    }
}