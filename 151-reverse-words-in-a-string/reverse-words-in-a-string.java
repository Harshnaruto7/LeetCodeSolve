class Solution {
    public String reverseWords(String s) {
      
      // reverse the string with the words

      // string given

      // need an array 

      String [] a = s.trim().split("\\s+"); // regx handling the spce

      // reverse it

      Collections.reverse(Arrays.asList(a));


      // joining the string


      return String.join(" "  ,a);


        
    }
}