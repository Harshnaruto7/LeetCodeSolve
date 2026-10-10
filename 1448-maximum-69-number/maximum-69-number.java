class Solution {
    public int maximum69Number (int num) {

        // cobert to string and then put it in char array

        char digits[] = String.valueOf(num).toCharArray();


        // to get '6' and then move it for '9'

        for(int i = 0; i < digits.length; i++){
          
          if(digits[i] == '6'){
            
            digits[i] = '9';

            break;

          }
      
        }     

        return Integer.parseInt(new String(digits));    






    }
}