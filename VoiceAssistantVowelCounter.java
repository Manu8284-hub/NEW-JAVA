public class VoiceAssistantVowelCounter {
    static int count(String s, int index){
        if(index==s.length()){
            return 0;
        }
        char ch=Character.toLowerCase(s.charAt(index));
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return 1+count(s,index+1);
        }
        return count(s,index+1);
    }
    public static void main(String[] args){
        String sentence="voice assistant";
        int result=count(sentence,0);
        System.out.println("Number of Vowels: "+ result);
    }
}
