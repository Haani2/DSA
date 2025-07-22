
public class LinerSearching {
    public static void main(String[] args) {
        int[] arr ={1,8,9,8,5,40,10,57};
        System.out.println( Search(arr , 57));


    }
    static int Search(int[] arr , int target){
        if (arr.length == 0) {
            return -1;
        }

        for ( int index=0; index < arr.length; index++) {

            if (arr[index] ==target){
                return index;
            }

        }
        return -1;
    }
}
