class Solution {
    public int mostWordsFound(String[] sentences) {
        

        int max = 0;

        for (int i = 0; i < sentences.length; i++) {


            // splitting the sentence into words and then getting it
            String word[] = sentences[i].split(" ");


            // comparing each word by index and index and we need to comapre length
            max = Math.max(max,word.length);

        }

        return max;



        
    }
}