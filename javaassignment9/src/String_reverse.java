import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        s=sc.nextLine();
        char[] try1=s.toCharArray();
        System.out.print("The reverse string is:");
        for(int i=try1.length-1;i>=0;i--)
        {
            System.out.print(try1[i]);
        }
    }
}
