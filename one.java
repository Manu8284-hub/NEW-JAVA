class ride{
    protected double baseFare;
    protected double distance;
    ride(double baseFare, double distance){
        this.baseFare=baseFare;
        this.distance=distance;
    }
    double calculateFare(){
        return baseFare*distance;
    }
}
class mini extends ride{
    mini(double baseFare, double distance){
        super(baseFare,distance);
    }
    @Override
    double calculateFare(){
        return super.calculateFare()+(10*distance);
    }
}
class sedan extends ride{
    sedan(double baseFare,double distance){
        super(baseFare,distance);
    }
    @Override
    double calculateFare(){
        return super.calculateFare()+(20*distance);
    }
}
class suv extends ride{
    suv(double baseFare,double distance){
        super(baseFare,distance);
    }
    @Override
    double calculateFare(){
        return super.calculateFare()+(30*distance);
    }
}
public class one {
    public static void main(String[] args){
        
    }
    
}
