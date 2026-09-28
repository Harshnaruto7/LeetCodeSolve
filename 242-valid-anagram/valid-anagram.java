
class Solution {
    public boolean isAnagram(String s, String t) {

   
   if(s.length()!=t.length()){
          
          return false;
   }


    // Hashmap 1 

   HashMap<Character,Integer> map1 = new HashMap<>();

    
    // Hashmap 2 

    HashMap<Character,Integer> map2 = new HashMap<>();




    // looping String 1 

    for(char x : s.toCharArray()){

        map1.put(x,map1.getOrDefault(x,0)+1);

    }

    for(char y : t.toCharArray()){
     
      map2.put(y,map2.getOrDefault(y,0)+1);

    }



    return map1.equals(map2);







        
    }
}