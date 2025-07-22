public class FirstandLastPosition {
    public static void main(String[] args) {


    }
    public  int[] searchRange(int[] nums, int target){
        int[] ans ={-1,-1};
    int start=    Searching(nums,target,true);
    int end =     Searching(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    int Searching(int[] nums,int target,boolean findstart){

        int ans =-1;
        int start=0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start);
            if (mid>target){
                start =mid+1;
            } else if (mid<target) {
                end = mid-1;
            }
            else {
                ans = mid;
                if(findstart){
                    end = mid-1;
                }
                else {
                    start = start+1;
                }
            }
        }
        return ans;
    }

}
