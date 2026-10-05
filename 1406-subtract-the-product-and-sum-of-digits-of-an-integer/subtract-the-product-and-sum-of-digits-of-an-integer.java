class Solution {
    public int subtractProductAndSum(int n) {
     


        int sum = 0;

        int product = 1;


        while( n > 0){


            // take the last digit

            int digit = n % 10;

            // add

            sum = sum + digit;

            // product

            product = product * digit;

            // remove last digit get new one


            n = n / 10;



        }


        int diff = (product - sum);


        return diff;









        
    }
}