class Solution {
    public String firstPalindrome(String[] words) {

        String ans = "";




        for (int i = 0; i < words.length; i++) {

            boolean isPalindrome = true;



            String temp = words[i];

            int left = 0;

            int right = words[i].length()-1;

            while(left<right){

                if(temp.charAt(left) != temp.charAt(right)){

                    isPalindrome = false;
                    break;


                }

                left++;
                right--;


            }

            if(isPalindrome){

                ans = temp;
                break;


            }



        }

        return ans;
        
    }
}