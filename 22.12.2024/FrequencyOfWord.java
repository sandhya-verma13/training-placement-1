import java.util.Scanner;
public class FrequencyOfWord {
    public static void main(String[] args) {
        String word; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        word = sc.nextLine();
        int Frequency[]=new int[word.length()] ;
        char string[] = word.toCharArray(); 
        for(int i=0;i<word.length();i++)
        {
            Frequency[i] = 1;
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i) == word.charAt(j)){
                    Frequency[i]++;
                    string[j] ='0' ; 
                }
                
            }
        }
        for(int i=0;i<Frequency.length;i++){
            if(string[i] != ' ' && string[i]!='0'){
                System.out.println(string[i] + "-> "+ Frequency[i]);
            }
        }
    }
}  


