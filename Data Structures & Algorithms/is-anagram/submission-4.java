class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] holder = new int[26];

        for(int i = 0; i < s.length(); i++){
            holder[s.charAt(i) - 'a']++;
            holder[t.charAt(i) - 'a']--;
        }

        System.out.println(Arrays.toString(holder));

        for(int checker : holder){
            if(checker != 0){
        System.out.println(checker);

                return false;
            }
        }

        return true;
    }
}
