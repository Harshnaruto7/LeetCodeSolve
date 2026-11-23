class Solution {
    public List<Integer> majorityElement(int[] nums) {

          HashMap<Integer,Integer> map1 = new HashMap<>();

        ArrayList<Integer> list1 = new ArrayList<>();



        for(int arr : nums){


            map1.put(arr, map1.getOrDefault(arr,0)+1);

        }


        // we are getting the frequency from the hashmap {key , value} value define the frequency


       // using keySet to get the keys


        for(int key : map1.keySet()){

            if(map1.get(key) > nums.length/3){
                list1.add(key);
            }



        }

        return list1;




        
    }
}