class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        //System.out.println(s1);
        String sb = new StringBuilder(s1).reverse().toString();
        //System.out.println(sb);
        return s1.equals(sb);

    }
}
