class Solution {
    public int heightChecker(int[] heights) {

       
       // height array given

       // new temp array as expected 

       int temp[] = new int[heights.length];


       // looping elemnt

       for(int i=0; i < heights.length; i++){
           
           temp[i] = heights[i];
       }

       // sorting

       Arrays.sort(temp);


       // checking for the difference

       int count = 0;


       for(int j = 0; j < temp.length; j++){
           
           if(temp[j]!=heights[j]){

            count++;
           }


       }



       return count;




        




        
    }
}