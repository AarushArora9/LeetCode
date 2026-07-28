class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int freq[]=new int[26];
        String middle=(n&1)==1?String.valueOf(s.charAt(n>>1)):"";
        StringBuilder sb=new StringBuilder();
        n>>=1;
        for(int i=0;i<n;i++)
        freq[s.charAt(i)-'a']++;
        for(int i=0;i<26;i++)
        sb.append(String.valueOf((char)(i+'a')).repeat(freq[i]));
        return sb.toString() + middle + sb.reverse().toString();
    }
}
