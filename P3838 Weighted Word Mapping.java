class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();;
        for(String i: words)
        {
            int c=0;
            for(char d: i.toCharArray())
            {c+=weights[d-'a'];}
            c=c%26;
            s.append((char)('z'-c));
        }
        return s.toString();
    }
}
