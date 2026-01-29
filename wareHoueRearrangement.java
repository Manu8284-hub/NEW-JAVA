public class wareHoueRearrangement {
    static void reverse(int arr[], int left, int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int packages[]={10,20,30,40,50};
        reverse(packages,0,packages.length-1);
        for(int x:packages){
            System.out.print(x+" ");
        }
    }
}
