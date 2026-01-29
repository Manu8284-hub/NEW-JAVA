public class officeFileVerification {
    static boolean isSorted(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[] args) {
        int empsid[]={101,104,108,120};
        System.out.println(isSorted(empsid,0));
    }
}
