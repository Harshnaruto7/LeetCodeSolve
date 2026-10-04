class Solution {
    public int countDigits(int num) {
        


        int ref = num;

        int count = 0;



        while(num > 0){

            // get the last digit

            int digit = num % 10;

            if(ref % digit == 0){

                count++;

            }

            // remove the last number

            num = num / 10;

        }

        return count;


        
    }
}