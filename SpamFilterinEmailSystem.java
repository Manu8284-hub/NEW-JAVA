public class SpamFilterinEmailSystem {
    static String removeChar(String s, char target){
        if(s.length()==0){
            return "";
        }
        char first=s.charAt(0);

        if(first==target){
            return removeChar(s.substring(1),target);
        }
        return first+removeChar(s.substring(1),target);
    }
    public static void main(String[] args) {
        String email="he#ll#o#wo#rld";
        char remove='#';
        System.out.println(removeChar(email, remove));
    }
    
}
