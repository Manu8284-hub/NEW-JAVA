import java.util.*;
public class power {
    static int pow(int base, int exp){
        if(exp==0){
            return 1;
        }
        int res=1;
        for(int i=1;i<=exp; i++){
            res*=base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        System.out.println(pow(base,exp));
    }
}
