class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {



        // creating array list 

        ArrayList<Integer> ans = new ArrayList<>();


        
        for(int i = 1; i < height.length; i++){
             
             // checking previous element if its bigger

             if(height[i-1] > threshold){
                 
                 ans.add(i);

             }



        }

        return ans;





        
    }
}