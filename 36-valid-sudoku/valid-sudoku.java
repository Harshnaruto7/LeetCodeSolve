class Solution {
    public boolean isValidSudoku(char[][] board) {


     
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];



        // initialize all 9 sets


        for (int i = 0; i < 9; i++){
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
        }


        // go through every cell
        for (int row = 0; row < 9; row++){

            for (int col = 0; col < 9; col++) {

                char num = board[row][col];


                // if cell is empty skip

                if (num == '.') {
                    continue;
                }


                // find the box number of which 3x3 cell the box belong

                int box = (row / 3) * 3 + (col / 3);


                // check for duplicate

                if (rows[row].contains(num) || cols[col].contains(num) || boxes[box].contains(num)) {

                  

                    return false;
                    
                }

                // add the number
                rows[row].add(num);
                cols[col].add(num);
                boxes[box].add(num);
                
            }
            
         }

         return true;


        
    }
}