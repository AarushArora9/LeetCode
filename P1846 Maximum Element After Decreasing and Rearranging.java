class Solution {
    private static int maxn=100000;
    private static int freq[]=new int[maxn];
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
        for(int v:arr){
            if(v<=n)freq[v-1]++;
        }
        int max=n,c=-1;
        for(int v=0;v<max;v++)
        {
            c+=freq[v];
            if(c>v)
            {
                max-=c-v;
                c=v;
            }
            freq[v]=0;
        }
        Arrays.fill(freq,max,n,0);
        return max;
    }
}
