public class cctv {
    static int lastIndex(int arr[], int index, int target){
        if(index==arr.length){
            return -1;
        }
        int foundInRest=lastIndex(arr, index+1, target);
            if(foundInRest!=-1){
                return foundInRest;
            }
            if(arr[index]==target){
                return index;
            }
            return -1;
        
    }
    public static void main(String[] args) {
        int frames[]={5,3,7,3,9,3};
        int targetFrame=3;
        System.out.println(lastIndex(frames,0,targetFrame));
    }
}
