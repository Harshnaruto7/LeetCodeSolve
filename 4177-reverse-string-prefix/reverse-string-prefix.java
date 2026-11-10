class Solution {
    public String reversePrefix(String s, int k) {

           StringBuilder sb = new StringBuilder();


        String prefix = s.substring(0,k);

        System.out.println(prefix);

        sb.append(prefix);

        String reverse = sb.reverse().toString();

        System.out.println(reverse);


        // reverse + word add

        String suffix = s.substring(k,s.length());

        System.out.println(suffix);

        String ans = reverse + suffix;

        return ans;
        
    }
}