class Solution {
    public int[] separateDigits(int[] nums) {

         ArrayList<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];

            // temp array list to store the value and then reverse later

            ArrayList<Integer> listTemp = new ArrayList<>();


            while(temp>0){


                int digit = temp % 10;

                listTemp.add(digit);

                temp = temp / 10;


            }


            for (int j = listTemp.size()-1; j >= 0 ; j--) {


                list1.add(listTemp.get(j));


            }


        }

        int ans[] = new int[list1.size()];


        for (int i = 0; i < ans.length; i++) {

            ans[i] = list1.get(i);

        }

        return ans;



        
    }
}