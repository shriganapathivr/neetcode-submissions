class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grp = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()) count[c - 'a']++;
            String key = Arrays.toString(count);
            grp.putIfAbsent(key,new ArrayList<>());
            grp.get(key).add(str);
        }
        return new ArrayList<>(grp.values());
    }
}
