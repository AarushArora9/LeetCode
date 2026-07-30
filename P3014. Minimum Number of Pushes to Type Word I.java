class Solution {
    public int minimumPushes(String word) {
        int n=word.length()/8;
        int m=word.length()%8;
        return 4*n*(n+1)+m*(n+1);
    }
}
