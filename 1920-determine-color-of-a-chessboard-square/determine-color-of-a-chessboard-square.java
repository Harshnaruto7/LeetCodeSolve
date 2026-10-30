class Solution {
    public boolean squareIsWhite(String coordinates) {

           String numb[] = {"1","2","3","4","5","6","7","8"};


        String character[] = {"a","b","c","d","e","f","g","h"};


        String numberCombination[] = new String[64];

        int index = 0;


        for (int i = 0; i < character.length; i++){


            for (int j = 0; j < numb.length; j++){

                numberCombination[index] = character[i] +numb[j];

                index++;




            }




        }

        System.out.println(Arrays.toString(numberCombination));


        for (int i = 0; i < numberCombination.length; i++){


            if(numberCombination[i].equals(coordinates)){

                // column and row

                int col = i / 8;
                int row = i % 8;



                // checking color

                return (col + row) % 2 != 0;

            }

        }

        return false;
        
    }
}