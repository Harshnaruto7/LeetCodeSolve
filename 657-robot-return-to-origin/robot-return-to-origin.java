class Solution {
    public boolean judgeCircle(String moves) {

                HashMap<Character,Integer > map1 = new HashMap<>();

        int x = 0;

        int y = 0;

        boolean flag = false;



        // looping for mapping
        for(char c :  moves.toCharArray() ){

            map1.put(c,map1.getOrDefault(c,0)+1);


        }




        // looping to get the total index
        for (int i = 0; i < map1.size(); i++) {

            if(map1.containsKey('U') || map1.containsKey('D')){
                y++;
            }

            if(map1.containsKey('R') || map1.containsKey('L')){
                x++;
            }
        }

      


       // checking Right and left
        if(map1.containsKey('R') && map1.containsKey('L')){
            if(map1.get('R').equals(map1.get('L'))){
                x = 0;
            }
        }



        // Checking Up and down
        if(map1.containsKey('U') && map1.containsKey('D')){
            if(map1.get('U').equals(map1.get('D'))){
                y = 0;
            }
        }


       // checking if they are at origin.
        if(x == 0 && y == 0){


            flag = true;


        }


        return flag;



        
    }
}