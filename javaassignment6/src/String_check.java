
import java.util.Scanner;
import java.util.regex.Pattern;

public class String_check {
    public static void main(String[] args) {
        String s;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
       s=sc.nextLine();
        if(Pattern.matches("[a-z]{1,}",s))
        {
            System.out.println("Small");
        }
        else if(Pattern.matches("[A-Z]{1,}",s)){
            System.out.println("CAPITAL");
        }
       else if(Pattern.matches("[0-9]{1,}",s)){
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Charcter");
        }
    }
}
