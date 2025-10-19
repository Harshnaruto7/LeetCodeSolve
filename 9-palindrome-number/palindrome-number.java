class Solution {
    public boolean isPalindrome(int x) {
            
            int numb = 0;

            int ori = x;
          

          if (x<0){
            return false;
          }
        


        while(x!=0){
              

         int ld = x % 10; // saves the last digit 
           
           numb = numb * 10 + ld;

           x = x/10;



        }

        if(numb==ori){
        
        return true;

        }


        return false;


      


        
    }
}