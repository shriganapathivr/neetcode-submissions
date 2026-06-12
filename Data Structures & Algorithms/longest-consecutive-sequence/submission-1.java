class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);  

        for(int num : set){
            if(!set.contains(num - 1)){
                int length = 1;
                while(set.contains(num + length)) length++;
                maxLen = Math.max(length,maxLen);
            }
        }    
        return maxLen;
    }
}
