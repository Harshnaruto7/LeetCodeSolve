class Solution {
    public int scoreOfString(String s) {
    

    int count = 0;

    for(int i =1;i<s.length();i++){
       
       count = count + Math.abs(s.charAt(i)-s.charAt(i-1));
    }


    return count;




        
    }
}