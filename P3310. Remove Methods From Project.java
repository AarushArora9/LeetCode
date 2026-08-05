class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i[]:invocations)
        {
            int a=i[0],b=i[1];
            adj.get(a).add(b);
        }
        boolean seen[]=new boolean[n];
        dfs(k,adj,seen);
        boolean check=true;
        for(int i[]: invocations)
        {
            int a=i[0],b=i[1];
            if(seen[a] || !seen[b])
            continue;
            check=false;
            break;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (check && seen[i]) continue;
            ans.add(i);
        }
        return ans;
    }
    private void dfs(int a, List<List<Integer>> adj,boolean [] seen)
    {
        seen[a]=true;
        for(int i: adj.get(a))
        {
            if(seen[i]) continue;
            dfs(i,adj,seen);
        }
    }
}
