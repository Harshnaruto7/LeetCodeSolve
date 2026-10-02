class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      


      // using hashmap

      HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();



      for(int i = 0; i < jewels.length(); i++){
            
            // putting jewels in map

            map.put(jewels.charAt(i),true);

      }


       int count = 0;

       for(int j=0; j < stones.length() ; j++){
         
         // comparting stone in map with jewels with key of map

         if(map.containsKey(stones.charAt(j))){

            count++;
         }


       }


        
        return count;





        
    }
}