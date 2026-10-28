class Solution {
    public int uniqueMorseRepresentations(String[] words) {


        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };


        HashMap<String,Integer> map1 = new HashMap<>();



        for(String word : words){
            
            String t = "";


            for(int i =0; i < word.length(); i++){
                  
                  char ch = word.charAt(i);


                  t = t + morse[ch - 'a'];

            }

            map1.put(t,1);



        }



        return map1.size();







        
    }
}