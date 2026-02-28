class sum{
    void add(){
        int a=10; 
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(double a, double b){
        double c=a+b;
        System.out.println(c);
    }

}
public class oops1{
    public static void main(String[] args){
        sum sum1= new sum();
        sum1.add();
        sum1.add(20,30);
        sum1.add(2.5,3.5);
    }
}