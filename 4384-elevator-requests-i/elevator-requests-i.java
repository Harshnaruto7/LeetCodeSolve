class Solution {
    public int elevatorRequests(int n, int[] requests) {


        // taking floor and time


        int current = 0;

        int time = 0;



        // we are moving the current value into floor as this our current floor

        for( int floor : requests){


            time = time + Math.abs(floor - current);

            current = floor;

        }


        return time;



       







        
    }
}