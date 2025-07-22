public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        int ans=BinaryS(arr,target);
        System.out.println(ans);
    }
    static int BinaryS(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1 ;
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

//    static int BinaryDescending(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length -1 ;
//        //  int mid = (start -end )/2; this can increase the int value
//        // by this it will not and we can find the mid element \
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                start = arr[mid] + 1;}
//
//            else if (target > arr[mid]) {
//            end = arr[mid] - 1; }
//            else
//            {return mid;}
//        }
//        return  -1;
//
//    }
}

