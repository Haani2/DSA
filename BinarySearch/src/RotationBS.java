public class RotationBS {
    public static void main(String[] args) {
       int [] arr = {4,5,6,7,0,1,2};
        System.out.println(FindTarget(arr,7));
    }
    static int FindTarget(int[] arr , int target){
     int pivot = Findpivot(arr);

     if (pivot== -1){
         return BinaryS(arr,target,0,arr.length-1);
     } 
     if (arr[pivot]==target){
         return pivot;
     }
     if (target>=arr[0]) {
         return BinaryS(arr,target,0,pivot-1);
         
     }
         return BinaryS(arr,target,pivot+1,arr.length-1);

    }
   static int BinaryS(int[] arr, int target,int start ,int end) {
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

  static int Findpivot(int[] arr ){
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

      return -1;
    }

}
