class Solution {
    public int[] topKFrequent(int[] nums, int k) {


           // using hashmap


        HashMap<Integer,Integer> map1 = new HashMap<>();


        // getting the number frequency



        for(int element : nums){

            // this thing add the value and their frequency
            map1.put(element,map1.getOrDefault(element,0)+1);

        }



        // now we get the frequency of each element
        // now we are moving all the element into list to sort them


        ArrayList<Map.Entry<Integer,Integer>> list1 = new ArrayList<>(map1.entrySet());


        // now sorting it by frequency


        list1.sort((a,b)-> Integer.compare(b.getValue(),a.getValue()));


        // now getting the array in that according to k

        int ans[] = new int[k];


        for (int i = 0; i < k; i++){

            // getting the item and their number
            ans[i] = list1.get(i).getKey();

        }


        return ans;




 







    }
}