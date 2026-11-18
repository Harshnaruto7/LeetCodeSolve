class Solution {
    public boolean validPalindrome(String s) {

         int left = 0;

        int right = s.length()-1;

        boolean flag = true;


        while(left<right){

            if(s.charAt(left) != s.charAt(right)){

                // skip the left character

                int l1 = left+1;
                int r1 = right;


                while (l1<r1 && s.charAt(l1) == s.charAt(r1)){

                    l1++;
                    r1--;

                }

                boolean option1 = l1 >= r1;

                // skip the right character

                int l2 = left;
                int r2 = right-1;

                while (l2<r2 && s.charAt(l2) == s.charAt(r2)){

                    l2++;
                    r2--;

                }

                boolean option2 = l2 >= r2;

                flag = option1 || option2;

                break;

            }

            left++;
            right--;



        }



        if(flag == true){

            return true;

        }


        return false;

       


        

        
    }
}