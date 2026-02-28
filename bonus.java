import java.util.*;
class employee{
    protected double baseSalary;
    employee(double baseSalary){
        this.baseSalary=baseSalary;
    }
    double calculateSalary(){
        return baseSalary;
    }
}
class manager extends employee{
    private double bonus;
    manager(double baseSalary, double bonus){
        super(baseSalary);
        this.bonus=bonus;
    }
    @Override
    double calculateSalary(){
        return super.calculateSalary()+bonus;
    }
}
public class bonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double baseSalary=sc.nextInt();
        double bonus=sc.nextInt();

        manager m1= new manager(baseSalary, bonus);
        System.out.println("₹"+m1.calculateSalary());
    }
}
