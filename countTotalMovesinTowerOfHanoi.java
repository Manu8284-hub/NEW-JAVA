public class countTotalMovesinTowerOfHanoi {
    static int tower(int n){
        if(n==0){
            return 0;
        }
        return 2*tower(n-1)+1;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(tower(n));
    }
    
}
