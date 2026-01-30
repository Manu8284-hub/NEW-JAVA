public class palindrome {
    static int rev(int n, int reversed){
        if(n==0){
            return reversed;
        }
        return rev(n/10,reversed*10+(n%10));
    }
    static boolean isPalindrome(int n){
        int reversed=rev(n,0);
        return n==reversed;
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));
    }
}
