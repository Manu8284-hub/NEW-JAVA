import java.util.*;
class mediaPlayer{
    void play(){
        System.out.println("player");
    }
}
class audioPlayer extends mediaPlayer{
    @Override
    void play(){
        System.out.println("audioPlayer");
    }
}
class videoPlayer extends mediaPlayer{
    @Override
    void play(){
        System.out.println("video player");
    }
}
public class media {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        mediaPlayer m1= new mediaPlayer();
        String player=sc.nextLine();
        if(player.equalsIgnoreCase("audioplayer")){
            m1=new audioPlayer();
            m1.play();
        }else if(player.equalsIgnoreCase("videoplayer")){
            m1=new videoPlayer();
            m1.play();
        }
    }
    
}
