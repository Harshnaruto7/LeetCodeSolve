class Solution {
    public int strStr(String haystack, String needle) {
     

     // String h = "aaaabbb"
     // String n = "aa"

     int lenH = haystack.length();  // y

     int lenN = needle.length();   // x

       

       
       for(int i=0;i<=lenH-lenN;i++){
         
         int j;

         for(j =0;j<lenN;j++){

            if(haystack.charAt(i+j)!=needle.charAt(j)){
                
                break;



            }

         
          



         }

            // if len it recah the j at the end of needle then all compare

            if(j==lenN){
                return i;
            }

         







       }
       

return -1;


        
    }
}