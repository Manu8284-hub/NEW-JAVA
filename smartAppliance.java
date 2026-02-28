import java.util.Scanner;

class appliance{
    void turnOn(){
        System.out.println("on");
    }
}
class ac extends appliance{
    @Override
    void turnOn(){
        System.out.println("ac is on");
    }
}
class fan extends appliance{
    @Override
    void turnOn(){
        System.out.println("fan is on");
    }
}
class light extends appliance{
    @Override
    void turnOn(){
        System.out.println("light is on");
    }
}

public class smartAppliance {
    public static void main(String[] args){
        
        
        
        Scanner sc= new Scanner(System.in);
        String device=sc.nextLine();
        appliance a1= new appliance();

        if(device.equalsIgnoreCase("ac")){
            a1=new ac();
            a1.turnOn();

        }
        else if(device.equalsIgnoreCase("fan")){
            a1=new fan();
            a1.turnOn();
        }
        else if(device.equalsIgnoreCase("light")){
            a1=new light();
            a1.turnOn();
        }
    }
    
}
