import java.util.*;
class account{
    double calculateInterest(double balance){
        return 0;
    }
}
class savingAccount extends account{
    @Override
    double calculateInterest(double balance){
        return balance*0.05;
    }
}
class currentAccount extends account{
    @Override
    double calculateInterest(double balance){
        return balance*0.02;
    }
}
public class bankAccount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String type=sc.nextLine();
        double balance=sc.nextInt();

        account a1= new account();
        if(type.equalsIgnoreCase("savingAccount")){
            a1=new savingAccount();
        }else if(type.equalsIgnoreCase("currentAccount")){
            a1=new currentAccount();
        }
        double interest=a1.calculateInterest(balance);
        System.out.println(interest);
    }
}
