class Solution {
    public double angleClock(int hour, int minutes) {
        double angle=Math.abs(0.5*(60*hour+minutes)-6*minutes);
        return Math.min(angle,360-angle);
    }
}
