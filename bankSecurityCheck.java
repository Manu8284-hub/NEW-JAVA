public class bankSecurityCheck {
    static boolean isPalindrome(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
    public static void main(String[] args) {
        String securityCode="RADAR";
        boolean result=isPalindrome(securityCode, 0, securityCode.length()-1);
        if(result){
            System.out.println("valid security code (Palindrome)");
        }else{
            System.out.println("invalid security code (not a palindrome)");
        }
    }
    
    
}
