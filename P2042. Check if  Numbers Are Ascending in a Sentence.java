class Solution {
    public boolean areNumbersAscending(String s) {
        int curr=-1,prev=-1;
        for(String i: s.split(" "))
        {
            if(Character.isDigit(i.charAt(0)))
            {
                curr=Integer.parseInt(i);
                if(prev==-1)
                prev=curr;
                else
                {
                    if(prev>=curr)
                    return false;
                }
            }
            prev=curr;
        }
        return true;
    }
}
