import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) 
    {
            if(s.length()!=t.length()){
                return false;
            }
            char [] arr1 = s.toCharArray();
            char [] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String an1 = new String(arr1);
            String an2 = new String(arr2);
            if(an1.equals(an2)){
                return true;
            }
            return false;
    }
}