import java.util.*;
class calculate{
    double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
    double calculateArea(double length, double breadth){
        return length*breadth;
    }
    double calculateArea(double base, double height,boolean isTriangle){
        return 0.5*base*height;
    }
}
public class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String shape= sc.next();

        calculate c1= new calculate();
        if(shape.equals("circle")){
            double radius=  sc.nextInt();
            System.out.println(c1.calculateArea(radius));
        }else if(shape.equals("rectangle")){
            double l=  sc.nextInt();
            double b=  sc.nextInt();
            System.out.println(c1.calculateArea(l,b));
        }else if(shape.equals("triangle")){
            double b=  sc.nextInt();
            double h=  sc.nextInt();
            System.out.println(c1.calculateArea(b,h));
        }
    }
    
}
