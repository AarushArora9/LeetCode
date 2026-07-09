class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean res[]=new boolean[queries.length];
        int color=0,idx=0;
        int arr[]=new int[n];
        for(int i=1;i<n;i++){
            arr[i]=nums[i]-nums[i-1]<=maxDiff?color:++color;
        }
        for(int i[]:queries)
        res[idx++]=arr[i[0]]==arr[i[1]];
        return res;
    }
}
