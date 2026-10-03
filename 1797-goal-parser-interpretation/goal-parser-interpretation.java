class Solution {
    public String interpret(String command) {
      

   // new string 
    String a = "" ; 
     

     // char array

     char x [] = command.toCharArray();

     // [a,b,c] -> char array


     
        for (int i = 0; i < x.length ; i++) {

            if(x[i] == 'G'){
                a = a + ("" + 'G');
            }

            if(x[i] == '(' && x[i+1] == ')'){

                a= a + ("" + 'o');
            }
            if(x[i] == '(' && x[i+1] == 'a'){

                a = a + ("" + 'a');
            }

            if(x[i] == 'l'){
                a = a + ("" + 'l');
            }

        }


        return a;













        
    }
}