public class smallestletter_greaterthan_target {
    public static char nextGreaterletter(char[]letters,char target){
       int s=0;
       int e=letters.length-1;
       while(s<=e){
        int mid=s+(e-s)/2;
        if(letters[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
       }
       return letters[s % letters.length];
    }
     public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char result = nextGreaterletter(letters, target);

        System.out.println("Smallest character greater than target: " + result);
    }

   
}
