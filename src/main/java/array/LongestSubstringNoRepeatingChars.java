package array;

public class LongestSubstringNoRepeatingChars {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String result="";
        char temp;
        int maxlength = 0;
        for(int i=0; i< s.length(); i++){
            temp = s.charAt(i);
            if(!result.contains(temp+"")){
                result = result + temp;
            }
            else{
                if(result.length() > maxlength){
                    maxlength = result.length();
                }
                result = result.substring(result.indexOf(temp)+1)+temp+"";
            }
        }
        return (maxlength>result.length())? maxlength: result.length();

    }
}
