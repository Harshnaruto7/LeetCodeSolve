class Solution {
    public String gcdOfStrings(String str1, String str2){

   // 1st check if concation is there        

   // 2nd if its concatinated then find the gcd of their length

   // at last we return the substring 
  
   

   // checking if they are concatinated or not

   if(!(str1+str2).equals(str2+str1)){

    return "";
   }


   // next finding the gcd of length

   int gcdLength = gcd(str1.length(),str2.length());

   
   // returning the value of the letter as gcd from substring
   return str1.substring(0,gcdLength);

        
    }

 //  helper function

   
   public int gcd(int a,int b){
       
       if(b==0){

        return a;
       }

       return gcd(b,a%b);




   }











}