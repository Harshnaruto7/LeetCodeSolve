class Solution {
    public boolean canAliceWin(int[] nums) {
       

        int sumAlice = 0;

        int sumBob = 0;

        boolean flag = false;


        for (int i = 0; i < nums.length; i++) {

            // double digit putting here
            if(nums[i]>9){

                sumAlice = sumAlice + nums[i];

            }

            else {


                sumBob = sumBob + nums[i];

            }

        }

        if(sumAlice > sumBob){

            flag = true;

        }

        sumAlice = 0;
        sumBob = 0;


        for (int i = 0; i < nums.length; i++) {


            if(nums[i] <= 9){

                sumAlice = sumAlice + nums[i];




            }

            else {

                sumBob = sumBob + nums[i];


            }




        }


        if(sumAlice > sumBob){

            flag = true;

        }


        return flag;






        
    }
}