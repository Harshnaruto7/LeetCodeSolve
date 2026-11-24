class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

         ArrayList<Integer> lis1 = new ArrayList<>();

        boolean flag = false;


        for (int i = 1; i < arr.length-1; i++) {


            if((arr[i] % 2 != 0) && arr[i-1] % 2 != 0 && arr[i+1] % 2 != 0 ){

                lis1.add(arr[i-1]);
                lis1.add(arr[i]);
                lis1.add(arr[i+1]);
            }







        }

       


        if(lis1.size() >= 3){

            flag = true;




        }

      return flag;





        
        
    }
}