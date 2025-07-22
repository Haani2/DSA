public class floorAlpha {
    public static void main(String[] args) {
        char[] arr = {'b','c','i','j'};

        System.out.println(Smallest(arr,'j'));
    }
    static char Smallest(char[] array , char target){
        int start = 0;
        int end = array.length-1;
//        if (target>array[array.length-1]){
//            return 'A';
//        }
        int mid = start+(end - start);

        while (start<end){
            if (target<array[mid]){
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return array[start % array.length];

    }
}
