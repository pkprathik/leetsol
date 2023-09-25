class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sSum = 0, tSum = 0;
        int ans = -1;
        for(int i=0; i<s.length(); i++) {
            sSum += (int)s.charAt(i);
        }
        for(int i=0; i<t.length(); i++) {
            tSum += (int)t.charAt(i);
        }
        ans = tSum - sSum;
        return (char)ans;
    }
}