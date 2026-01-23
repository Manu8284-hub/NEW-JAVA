public class print {
    static void printNo(int n){
        if(n==0){
            return ;
        }
        printNo(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNo(5);
    }
    
}
