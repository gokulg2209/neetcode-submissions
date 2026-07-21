class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        HashMap<Character, Integer> map= new HashMap<>();
        int left=0;

        for(int right=0; right<s.length(); right++){
            char current_char= s.charAt(right);

            if(map.containsKey(current_char)){
                left= Math.max(left, map.get(current_char)+1);
            }

            map.put(current_char, right);

            max= Math.max(max, right-left+1);
        }
        return max;
    }
}
