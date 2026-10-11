class Solution {
    public int largestAltitude(int[] gain) {



        int height = 0;
        int altitude = 0;


        for (int i = 0; i < gain.length; i++){

            altitude = altitude + gain[i];


            // checking which is bigger
            height = Math.max(height,altitude);

        }

        return height;

        
    }
}