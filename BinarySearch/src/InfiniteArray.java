public class InfiniteArray {
    // here we Know the length of the array
    public static void main(String[] args) {

        int[] arr ={2,3,4,5,10,17,20,21};

        System.out.println( range(arr,17));


    }

    static  int range(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end -1;
            // here is the formula
            end = end +(end - start+1 ) *2 ;
            start = temp;
        }
    return BinaryS(arr,target,start,end);
    }
    static int BinaryS(int[] arr, int target ,int start , int end) {

        if(target>arr[arr.length-1]){
            return -1;
        }
        //  int mid = (start -end )/2; this can increase the int value
        // by this it will not and we can find the mid element \
        while (start <= end) {

            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end = mid - 1;
            }
            else if (target>arr[mid]) {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return  -1;

    }
}
