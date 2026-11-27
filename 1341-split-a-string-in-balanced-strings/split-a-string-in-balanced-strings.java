class Solution {
    public int balancedStringSplit(String s) {

          int counter = 0;

        int finalCounter = 0;


        for (int i = 0; i < s.length(); i++) {



            char c = s.charAt(i);


            if(c == 'L'){

                counter--;

            }
            else {

                counter++;

            }

            if(counter==0){

                finalCounter++;

            }

            
        }


        return finalCounter;



        
    }
}