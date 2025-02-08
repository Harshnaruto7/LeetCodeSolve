class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         
         // simple max candies first we will take out
         // then we will check for each kid and add that in list 

         // finding largest 

         List<Boolean> a = new ArrayList<>(candies.length);
          
          int maxCan =0;

         for(int i=0;i<candies.length;i++){
              
              if(candies[i]>maxCan){

                maxCan=candies[i];

              }


         }

        // now comparing 

        for(int j=0;j<candies.length;j++){
          
          if(candies[j]+extraCandies >= maxCan ){
              
              a.add(true);

          }
          else{
            a.add(false);
          }


        }
         

         return a;

    }
}