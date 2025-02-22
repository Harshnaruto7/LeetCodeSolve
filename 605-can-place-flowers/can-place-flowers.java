class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        // 1 fill 
        // 0 empty
        // can plant near adject flower need 0 0 


        //  array given

        for(int i =0;i<flowerbed.length;i++){
             
             if(flowerbed[i]==0){
                 // check left and right

                 // left 

                 int left = (i==0 || flowerbed[i-1]==0)?0:1; // leftmost and  left elemeent
                 // right
                 int right = (i==flowerbed.length-1||flowerbed[i+1]==0)?0:1;  // length-1 for the length
               
               if(left==0 && right==0){
               
               // plant it

               flowerbed[i]=1;
               n--; // 1 plant then we can calculate for the rest
               
               if(n==0){
                return true;
               }
               }

             }





        }

        return n<=0;





        
    }
}