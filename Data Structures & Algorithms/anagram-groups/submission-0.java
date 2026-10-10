class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> holder = new HashMap<>();

        for(String str: strs){
            
            int[] counter = new int[26];
            for (char c : str.toCharArray()){
                counter[c - 'a']++;
            }
            String key = Arrays.toString(counter);
            holder.putIfAbsent(key, new ArrayList());
            holder.get(key).add(str);
        }

        return new ArrayList(holder.values());


    }
}
