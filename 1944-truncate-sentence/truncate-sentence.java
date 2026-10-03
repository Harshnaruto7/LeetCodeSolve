class Solution {
    public String truncateSentence(String s, int k) {

        // taking all the word in each index 

        String arr[] = s.split(" ");

        String a = "";


        for(int i = 0; i < k;i++){
            
            if(i > 0){
                a = a + " ";
            }

            a = a + arr[i];



        }

        return a;
      




        
    }
}