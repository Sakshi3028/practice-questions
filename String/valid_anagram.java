package String;

public class valid_anagram {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
          return false;
        }
        int[]count=new int[26];
        //count s charcaters
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
          for(int i=0;i<s.length();i++){
            count[t.charAt(i)-'a']--;
          }
          for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
          }
          return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nanagram";
        if(isAnagram(s, t)){
            System.out.print("valid anagram");
        }
        else {
            System.out.println("Not a Valid Anagram");
        }
    }
}
