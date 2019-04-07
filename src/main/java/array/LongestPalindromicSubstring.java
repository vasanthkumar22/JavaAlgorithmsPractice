package array;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));

    }

    public static String longestPalindrome(String s) {
        String result = "";
        String str="";
        int[] lengthArray = new int[s.length()];

        //length of the substring
        for(int i=1; i <= s.length(); i++){
            //start position of the substring
            for(int j=0; j+i <= s.length(); j++){
                str = s.substring(j, j+i);
                if(isPalindrome(str)){
                    if(result.length() <= str.length()){
                        result = str;
                    }
                }
            }

        }
        return result;
    }

    public static boolean isPalindrome(String s){

        for(int i=0, j=s.length()-1; i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }


}
