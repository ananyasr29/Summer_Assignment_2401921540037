class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result = new ArrayList<>();

        if(p.length()>s.length()){
            return result;
        }
        int[]freqP=new int[26];
        for(int i=0;i<p.length();i++){
            freqP[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            int[] freqS=new int[26];
            for(int j=i;j<i+p.length();j++){
                freqS[s.charAt(j)-'a']++;
            }
            if(sameFrequency(freqP, freqS)){
                result.add(i);
            }
        }
        return result;
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