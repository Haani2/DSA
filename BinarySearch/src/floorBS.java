public class floorBS {
    public static void main(String[] args) {
        int[] arr ={2,3,5,7,14,16,18};
        System.out.println(floorval(arr,20));
    }
    static int floorval(int[] array , int target){
        int start =0;
        int end = array.length -1;
        if (target > array[array.length-1])// target is Greater Then the last element
        {
            return -1;
        }
        while (start<=end){
            int mid = start + (end - start);
            if ((target<=array[mid])){
                end = mid -1;
            }
            else if ((target>=array[mid])){
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return end;
    }
}
