public class SearchStr {
    public static void main(String[] args) {
        String name = "Utkarsh";
        System.out.println(Search(name, 'a' ));

    }
    static String Search(String str, char target ){
        if (str.isEmpty()){
            return "Empty";
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return "yes";

            }
        }
        return "not found";
    }
}
