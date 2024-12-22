import java.util.Scanner;
public class Reversestring {
    public static void main(String[] args) {
        String word;
        String reversestring ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        word=sc.nextLine();
        for(int i=0;i<word.length();i++){
            reversestring = word.charAt(i) + reversestring;
        }
        System.out.println("Reverse of the string is : " + reversestring);
    }
}
