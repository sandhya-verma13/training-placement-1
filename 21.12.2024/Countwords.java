import java.util.Scanner;
public class Countwords {
    public static void main(String args[]) {
        String wrd;
        Scanner st = new Scanner(System.in); 
        System.out.println("Enter the Words :");
        wrd = st.nextLine(); 
        int countWords = wrd.split("\\s").length;
        System.out.println(countWords);
    }
}
