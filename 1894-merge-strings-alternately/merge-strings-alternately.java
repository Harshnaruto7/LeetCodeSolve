class Solution {
    public String mergeAlternately(String word1, String word2) {
      
      // using stringBuiler collection framework

      StringBuilder a = new StringBuilder();

      // string given
      // need pointer

      int i =0;
      int j=0;

      int len1 = word1.length();
      int len2 =  word2.length();
      

      // travers

      while(i<len1 && j<len2){
       
       a.append(word1.charAt(i++));
       a.append(word2.charAt(j++));
      }

      // now leftover string if any

      while(i<len1){
        a.append(word1.charAt(i++));
      }

      while(j<len2){
        a.append(word2.charAt(j++));
      }
        
        // need to convert string builder to string(toString)
         return a.toString();





        
    }
}