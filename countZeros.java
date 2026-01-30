public class countZeros {
    static int countZero(int n){
        if(n==0){
            return 0;
        }
        int count=countZero(n/10);
        if(n%10==0){
            return count+1;
        }
        return count;
    }
    public static void main(String[] args){
        int n=102030;
        System.out.println(countZero(n));
    }
}
