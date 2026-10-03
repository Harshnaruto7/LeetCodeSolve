class Solution {
    public int numberOfSteps(int num) {


        int count = 0;



        while( num > 0) {
           

           if( num % 2 == 0){

            // even
                
                num = num / 2;

                count++;

           }

           else{
              
              // odd 

              num = num -1;

              count++;


           }





        }


        return count;
       








        
    }
}