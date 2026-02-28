class animal{
    void sound(){
        System.out.println("sound");
    }
}
class dog extends animal{
    @Override void sound(){
        System.out.println("bark");
    }
    void eat(){
        System.out.println("eating");
    }
}
public class overriding {
    public static void main(String[] args) {
        animal a= new dog();
        a.sound();
    }
}