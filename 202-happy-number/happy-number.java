class Solution {
    public boolean isHappy(int n) {

            HashSet<Integer> set1 = new HashSet<>();


        while(!set1.contains(n)){

            set1.add(n);


            n = getNextNumber(n);

            if(n == 1){

                // happy number

                return true;

            }



        }

        return false;
        
    }

       private int getNextNumber(int n){

        int sum = 0;


        while (n > 0){

            int digit = n % 10;

            sum = sum + digit * digit;

            n = n / 10;


        }

        return sum;

    }









}