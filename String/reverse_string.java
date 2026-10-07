package String;

public class reverse_string {
    public  static void reverse_string(char[]s){
        int left=0;
        int right=s.length-1;
      while(left<right){
        char temp=s[left];
         s[left]=s[right];
         s[right]=temp;
         left ++;
         right--;
      }
    }
    public static void main(String[] args) {
        char[] A= {'h','e','l','l','o'};
        System.out.println("before reversing");
        for(char ch: A){
            System.out.println(ch + " ");
        }
        reverse_string(A);
         System.out.println("\nAfter reversing:");

        for (char ch : A) {
            System.out.print(ch + " ");
        }
    }
}
