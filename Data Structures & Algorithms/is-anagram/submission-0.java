class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] s_1=s.toCharArray();
        char[] t_1=t.toCharArray();
        Arrays.sort(s_1);
        Arrays.sort(t_1);
        return Arrays.equals(s_1,t_1);
    }
}
