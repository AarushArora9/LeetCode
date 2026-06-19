class Solution {
    public int largestAltitude(int[] gain) {
       int initial=0;
       int max=0;
       for(int i: gain)
       {
        initial=initial+i;
        max=Math.max(max,initial);
       }
       return max;
    }
}
