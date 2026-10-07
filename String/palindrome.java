package String;

public class palindrome {
    public static boolean ispalindrome(String str){
    int left=0;
    int right=str.length()-1;
       
    while (left<right) {
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left ++;
        right --;
        } 
        
            return true;
          
    
    }
    public static void main(String[] args) {
        String str="madam";
         if(ispalindrome(str)){
            System.out.print(str + " is palindrome");
         }else{
            System.out.print(str + " is not palindrome");
         }
    }
   
}
