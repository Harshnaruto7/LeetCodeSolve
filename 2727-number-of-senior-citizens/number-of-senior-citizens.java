class Solution {
    public int countSeniors(String[] details) {

          int appearance = 0;


        for (int i = 0; i < details.length; i++) {

            int age = Character.getNumericValue(details[i].charAt(11))*10+
                      Character.getNumericValue(details[i].charAt(12));

            if(age>60){

                appearance++;

            }




        }

        return appearance;
        
    }
}