class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;

        while(i<j){

            if(target==numbers[i]+numbers[j]){
                return new int[]{i+1,j+1};
            }

            if(target<numbers[i]+numbers[j]){
                j--;
            }

            if(target>numbers[i]+numbers[j]){
                i++;
            }

        }

        return new int[]{i,j};
        


        
    }
}