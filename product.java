public class product {
    static int mul(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*mul(n/10);
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(mul(n));
    }
    
}
