public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1,2,5,8,};
        //System.out.println(nums.length);

    }
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int len = nums.length;
            int[] ans = new int[2* nums.length ];
            for(int i=0;i< nums.length;i++){
                ans[i] = nums[i];
                ans[i+ len ] = nums[i];

            }
            return ans;

        }
    }
}


