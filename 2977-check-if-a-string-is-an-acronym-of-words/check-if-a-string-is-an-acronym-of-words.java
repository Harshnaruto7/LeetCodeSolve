class Solution {
    public boolean isAcronym(List<String> words, String s) {



        int n = words.size();

        StringBuilder a = new StringBuilder();

        for (int i = 0; i < n; i++) {

            a.append(words.get(i).charAt(0));

        }

        boolean b = a.toString().equals(s);

        return b;

        
    }
}