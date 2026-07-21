class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int cnt1=0,maxm=0,currcnt0=0,lastcnt0=0;
        for(char c: s.toCharArray())
        {
            if(c=='0')currcnt0++;
            else{
                if(currcnt0!=0)
                lastcnt0=currcnt0;
                currcnt0=0;
                cnt1++;
            }
            maxm=Math.max(maxm,currcnt0+lastcnt0);
        }
        if(maxm==currcnt0 || maxm==lastcnt0) 
        return cnt1;
        return cnt1+maxm;
    }
}
