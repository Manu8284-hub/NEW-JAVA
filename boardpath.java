public class boardpath {
    static void borad(int curr, int end, String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for(int dice=1; dice<=6; dice++){
            borad(curr+dice,end,ans+dice);
        }
        
    }
    public static void main(String[] args){
            borad(0,3,"");
        }
    
}
