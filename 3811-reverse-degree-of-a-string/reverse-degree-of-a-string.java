class Solution {
    public int reverseDegree(String s) {

                int ans = 0;


        for (int i = 0; i < s.length(); i++){

            // normal position of each character a = 1,b=2

            int normal = s.charAt(i) - 'a' + 1;

            // reverse the position of character a = 26 , b=25

            int reverse =  27 - normal;


            // position in the string

            int position = i + 1;


            // product reverse * position

            ans = ans + reverse * position;




        }

        return ans;

        
    }
}