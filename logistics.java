import java.util.*;
class vehicle{
    int speed;
    vehicle(int speed){
        this.speed=speed;
    }
    void displayVehicle(){
        System.out.println("speed"+" "+speed);
    }
}
class transportVehicle extends vehicle{
    int capacity;
    transportVehicle(int speed, int capacity){
        super(speed);
        this.capacity=capacity;
    }
    void displayTransport(){
        System.out.println(capacity);
    }
}
class truck extends transportVehicle{
    truck(int speed , int capacity){
        super(speed, capacity);

    }
    void displayDetails(){
        displayVehicle();
        displayTransport();
        System.out.println("type: truck");
    }
}
public class logistics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int speed=sc.nextInt();
        int capacity=sc.nextInt();
        truck t = new truck(speed, capacity);
        t.displayDetails();
    }
    
}
