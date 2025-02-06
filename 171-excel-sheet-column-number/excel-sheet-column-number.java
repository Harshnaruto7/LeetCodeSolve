class Solution {
    public int titleToNumber(String columnTitle) {

     //in the excle sheet 

     // first using ASCII using that making the value

     // ch = charAt(i)
     // ASCII (A,B,C) -- (65,66,67)

     // value = ch - 'A' + 1;

     // run 
     // value = A - A + 1 --> (1)  for {A}   [ 65 - 65 + 1 ] --> 1 
     // value = B - A + 1 --> (2)  for {B}   [66 - 65 + 1]  [1+1] --> 2

     // now after getting the value
     // z -> 26 given in the question last elemenet   
     // result = result * 26


     int result = 0;


     for(int i=0;i<columnTitle.length();i++){

      // taking each char of string

      char c = columnTitle.charAt(i);

      // the value of each character through ASCII  (A,B) -- (65,66)

      int value = c - 'A' + 1;

      // the result final 

      result =  result * 26 + value;   // res = res * 26 (z --> 26 ) + value (ASCII)

     }


     return result;








        
    }
}