class Solution {
    public int numberOfSubstrings(String s) {
        char ch[]=s.toCharArray();
        int l=ch.length;
        int lastpos[]={-1,-1,-1};
        int total=0;
        for(int i=0;i<l;i++)
        {
            lastpos[ch[i]-'a']=i;
            int min=Integer.MAX_VALUE;
            for(int j:lastpos)
            min=Math.min(j,min);
            total+=1+min;
        }
        return total;
    }
}
