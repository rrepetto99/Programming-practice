public class Palindrome {
     // Exercise 8: Palindrome Checker
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length()-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);    
    }
    public static void main(String[] args) {
        String s = "level";
        boolean res = isPalindrome(s);
        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
