public class lexicographicalCounting {
    static void lexico(int curr, int n){
        if(curr>n){
            return;
        }
        System.out.print(curr+" ");
        for(int i=0; i<=9; i++){
            lexico(curr*10+i,n);
        }
    }
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            lexico(i,13);
        }
    }
    
}
