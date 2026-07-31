class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] wFreq = new int[128];
        int[] tFreq = new int[128];

        for(char ch: t.toCharArray()) tFreq[ch]++;

        int left=0;
        int have=0;
        int need=0;
        int minLen=Integer.MAX_VALUE;
        int minLeft=0;

        for(int i:tFreq) if(i>0) need++;

        for(int right=0;right<s.length();right++){
            char ch= s.charAt(right);
            wFreq[ch]++;

            if(tFreq[ch] > 0 && tFreq[ch] == wFreq[ch]) have++;

            while(have == need){
                int window= right-left+1;
                if(window < minLen){
                    minLen=window;
                    minLeft=left;
                }

                char leftChar= s.charAt(left);
                wFreq[leftChar]--;
                if(tFreq[leftChar] > 0 && wFreq[leftChar] < tFreq[leftChar]) have--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"": s.substring(minLeft,minLen+minLeft);
        
    }
}
