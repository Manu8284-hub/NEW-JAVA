public class lostocument {
    static int find(int arr[], int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return find(arr,index+1,target);
    }
    public static void main(String[] args){
        int records[]={45,78,12,90,78,56};
        int documentNumber=78;
        System.out.print(find(records,0,documentNumber));
    }
}
