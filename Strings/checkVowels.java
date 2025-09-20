public class checkVowels {

     public static boolean isVowel(char ch){
         return ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
         }

     public static int matchVowels (String str) {

         int count = 0;
         int n = str.length();
         for(int i = 0; i < n; i++) {
             char ch = str.charAt(i);
             if( isVowel(ch)) {
             count++;
             }
         }
       return count;
    }
     public static void main (String[] args) {
        String str = "progressive";
        int result = matchVowels(str);
        System.out.println("number of vowels are : " + result);
     }
}
            