class Solution {
    public String clearDigits(String s) {

           char a[] = s.toCharArray();

        String n = "";


        System.out.println(Arrays.toString(a));


        for (int i = 0; i < a.length; i++) {


            if(Character.isDigit(a[i])  ){

                if (n.length() > 0) {
                    n = n.substring(0, n.length() - 1);
                }






            }
            else {

                n = n + a[i];



            }






            }

        return n;

        
    }
}