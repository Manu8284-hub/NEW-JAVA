public class cointossProblem2 {
    static void coint(String str, int n){
        if(str.length()==n){
            System.out.println(str);
            return;
        }
        coint(str+"0",n);
        coint(str+"1",n);
    }
    public static void main(String[] args) {
        int n=2;
        coint("",n);
    }
    
}
