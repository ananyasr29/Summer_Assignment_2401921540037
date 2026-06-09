class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        if(len1>s2.length()){
            return false;
        }
        int[] freq1=new int[26];

        for(int i = 0; i < len1; i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=s2.length()-len1;i++){
            int[] freq2=new int[26];

            for(int j=i; j<i+len1;j++){
                freq2[s2.charAt(j)-'a']++;
            }
            if(sameFrequency(freq1, freq2)){
                return true;
            }
        }
        return false;
    }
    public boolean sameFrequency(int[] a, int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
