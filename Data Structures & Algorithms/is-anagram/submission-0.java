class Solution {
    public boolean isAnagram(String s, String t) {

        char[] strArr1 = s.toLowerCase().toCharArray();
        char[] strArr2 = t.toLowerCase().toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        if(Arrays.equals(strArr1, strArr2)){
            return true;
        }

        return false;
    
    }
}