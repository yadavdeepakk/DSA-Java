public class FindSubSets {

    public static void FindingSubSets (String str, int i, String ans){
        if( i == str.length ()) {
            if (ans.length () == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        FindingSubSets(str, i + 1, ans);
        FindingSubSets(str, i + 1, ans + str.charAt(i));
    }

    public static void main (String args []) {
        String str = "abc";
        FindingSubSets(str, 0, "");
    }
}