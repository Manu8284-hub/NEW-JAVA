public class reverseANumber {
    static int rev(int n, int reversed){
        if(n==0){
            return reversed;
        }
        return rev(n/10, reversed*10+(n%10));
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(rev(n,0));
    }
}
