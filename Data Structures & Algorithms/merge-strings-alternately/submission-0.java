class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int i= 0, j= 0, n= word1.length(), m= word2.length();

        while(i < n || j < m){
            if (i < n) builder.append(word1.charAt(i));
            if (j < m) builder.append(word2.charAt(j));
            i++;
            j++;
        }

        return builder.toString();
    }
}