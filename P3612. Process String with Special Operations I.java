class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char c: s.toCharArray())
        {
            switch (c) {
                case '#' -> res.append(res);
                case '%' -> res.reverse();
                case '*' -> { if (res.length() > 0) res.setLength(res.length() - 1); }
                default  -> res.append(c);
            }
        }
        return res.toString();
    }
}
