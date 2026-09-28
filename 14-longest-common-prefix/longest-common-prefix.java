class Solution {
    public String longestCommonPrefix(String[] strs) {

    
    // strs is string array

    
    // takeing a string array

    String prefix = strs[0];

    for(int i = 1; i < strs.length; i++){

      
      while(!strs[i].startsWith(prefix)){

        // then find the prefix from it

        prefix = prefix.substring(0,prefix.length()-1); // one less each itration


      }




    }



    return prefix;





        
    }
}