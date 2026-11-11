class Solution {
    public String reversePrefix(String word, char ch) {
        
         
         StringBuilder sb = new StringBuilder(word);
   

        String sub = word;



        int index = -1;

        for (int i = 0; i < word.length(); i++){


            if(word.charAt(i) == ch){

                index = i;
                break;

            }

        }

        if(index == -1){
              
              return word;

        }

       

        // we are deleting the from one above the index to the end

        String prefixReverse = sb.delete(index+1,sub.length()).reverse().toString();

     

        String suffix = word.substring(index+1,word.length());

        // combining both

        String ans = prefixReverse + suffix;

      
         

       return ans;

    }
}