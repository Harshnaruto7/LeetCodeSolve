class Solution {
    public int majorityElement(int[] nums) {
     

     //  array  given

      Arrays.sort(nums);

     return nums[nums.length/2];

          



    }
  

  public void bubbleSort(int[] arr){

   
     for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j]>arr[j+1]){

                    // swap

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }


            }

        }

        



  }



}