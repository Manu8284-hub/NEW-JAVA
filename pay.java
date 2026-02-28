import java.util.*;
class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    double processpayment(){
        return amount;
    }
}
class cc extends payment{
    cc(double amount){
        super(amount);
    }
    @Override
    double processpayment(){
        return amount + (amount*0.02);
    }
}
class dc extends payment{
    dc(double amount){
        super(amount);
    }
    @Override
    double processpayment(){
        return amount + (amount*0.01);
    }
}
class upi extends payment{
    upi(double amount){
        super(amount);
    }
    @Override
    double processpayment(){
        return amount + (amount*0.005);
    }
}
public class pay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String payment1= sc.next();
        double amount=sc.nextDouble();

        if(amount > 100000){
            System.out.println("invalid");
            return;
        }
        if(payment1.equals("cc")){
            payment p1= new cc(amount);
            System.out.println(p1.processpayment());
        }
        else if(payment1.equals("dc")){
            payment p1= new dc(amount);
            System.out.println(p1.processpayment());
        }
        else if(payment1.equals("upi")){
            payment p1= new upi(amount);
            System.out.println(p1.processpayment());
        }
    }
    
}
