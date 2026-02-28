import java.util.*;
class insuranceCompany{
    double calculatePremium(double amount){
        return 0;
    }
}
class healthPolicy extends insuranceCompany{
    @Override
    double calculatePremium(double amount){
        return amount*0.05;
    }
}
class lifePolicy extends insuranceCompany{
    @Override
    double calculatePremium(double amount){
        return amount*0.03;
    }
}
class vehiclePolicy extends insuranceCompany{
    @Override
    double calculatePremium(double amount){
        return amount*0.07;
    }
}
public class policy {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String type= sc.next();
        double amount=sc.nextDouble();
        insuranceCompany i1= new insuranceCompany();
        if(type.equalsIgnoreCase("healthPolicy")){
            i1= new healthPolicy();
            
        }else if(type.equalsIgnoreCase("lifePolicy")){
            i1= new lifePolicy();
            
        }else if(type.equalsIgnoreCase("vehiclePolicy")){
            i1=new vehiclePolicy();
            
        }
        double premium=i1.calculatePremium(amount);
        System.out.println(premium);
    }
}
