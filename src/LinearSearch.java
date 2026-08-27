public class LinearSearch {
    public static void main(String[] args) {

        int [] arr = {4,6,7,8,15};
        int search = 8;

        int found = linearSearch(arr,search);
        if(found !=-1){
            System.out.println("Element Found At Index:"+found);
        }
        else{
            System.out.println("Element Not Found");
        }
    }

    public static int linearSearch(int[] arr, int search) {
        for(int i =0; i<arr.length;i++){
            if(search == arr[i]){
                return i;
            }
        }

        return -1;
    }
}