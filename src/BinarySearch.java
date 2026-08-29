public class BinarySearch {
    public static void main(String[] args) {

        int [] sortArr = {5,8,10,12,16};
        int search = 8;

        int check = binarySearch(sortArr,search);

        if(check != -1){
            System.out.println("Element Found At Index:"+check);
        }
        else{
            System.out.println("Element Not Found");
        }
    }

    public static int binarySearch(int [] sortArr,int search){
        int first = 0;
        int last = sortArr.length-1;
        int mid = 0;

        while(first <= last){
            mid =(first+last)/2;

            if(sortArr[mid] == search){
                return mid;
            }
            else if(sortArr[mid]<search){
                first = mid +1;
            }
            else{
               last =  mid -1;
            }
        }
        return -1;
    }
}
