class Solution {
    public int removePalindromeSub(String s) {

           StringBuilder s1 = new StringBuilder(s);

       int count = 0;


       // adding this string


        String ans = s1.reverse().toString();

        System.out.println(ans);

        if(ans.equals(s)){
            count=1;

            return count;

        }

        count = 2;


        return count;


    }
}