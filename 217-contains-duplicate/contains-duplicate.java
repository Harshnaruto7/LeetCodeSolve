class Solution {
    public boolean containsDuplicate(int[] nums) {

        // using hashset to find the  duplicate element

        HashSet<Integer> a = new HashSet<>();


        // now using advance for loop for itration and check if it contains the duplicate 

        for(int n : nums){
           
           if(a.contains(n)){     // this return true statement

           return true;

           }

           a.add(n);



        }


        // if no duplicate found 

        return false;





     


        
    }
}