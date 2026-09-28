class Solution {

   static void mergeSort(int arr[] , int left, int right){
     
     
     // base case 

     if(left>=right){
        
        return;
     }

     // mid point

     int mid = (left+right)/2;


     // left sorting

     mergeSort(arr,left,mid);


     // right sorting

     mergeSort(arr,mid+1,right);




     // combining together

     merge(arr,left,mid,right);

   }



   static void merge(int arr[],int left,int mid, int right){
      

      // new temp array

      int temp[] = new int[right-left+1];


      // left pointer i 

      int i = left;


      // right pointer j

      int j = mid+1;


      // indexing the array temp

      int k = 0;


      // seraching for the smallest element

      while(i<= mid && j<= right){

        
        // if left element is snall put it in temp array
        if(arr[i]<arr[j]){
            
            temp[k] = arr[i];

            i++;
        }

        // if right is small 

        else{
          
          temp[k] = arr[j];

          j++;



        }

        k++;



      }


      // if left element is there put all there in temp 

      while(i <= mid){
       
       temp[k] = arr[i];

       i++;
       k++;


      }

      // if right element is there put them in temp

      while(j <= right){
       
       temp[k] = arr[j];

       j++;
       k++;

      }


      // now putting the sorted array to real array


      for(int x = 0 ; x < temp.length; x++){
       
       arr[left+x] = temp[x];

      }


   }



    public int[] sortArray(int[] nums) {



        // we got array nums


        mergeSort(nums,0,nums.length-1);


        return nums;
     



     





        
    }
}