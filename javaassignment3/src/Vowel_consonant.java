import java.util.Scanner;
import java.util.regex.Pattern;

public class Vowel_consonant {
    public static void main(String[] args) {
        String s;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a string:");
        s=reader.nextLine();

           // System.out.print(try1[i]);
            if(Pattern.matches("[a-zA-Z]{1,}",s))
            {
                //char[] try1 = s.toCharArray();
                for(char c: s.toCharArray())
                {
                    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                        System.out.print("Vowel ");
                    else
                        System.out.print("Consonant ");
                }
               /* for (int i =0;i>=try1.length-1;i++){
                    if (try1[i] == 'a' || try1[i] == 'A' || try1[i] == 'e' || try1[i] == 'E' || try1[i] == 'i' || try1[i] == 'I' || try1[i] =='o' || try1[i]=='O' || try1[i] == 'u' || try1[i] == 'U') {
                        System.out.print("Vowel ");
                    }
                    else
                    {
                        System.out.print("Consonant ");
                    }
                }*/
            }
            else
            {
                System.out.println("Error message:Input is not letter.");
            }


    }
}
