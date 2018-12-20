import java.util.Scanner;

public class String_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int n;
        int len;
        System.out.println("Enter the string and number:");
        s=sc.nextLine();
        n=sc.nextInt();
        String str;
        len=s.length();
        str=s.substring(len-n);
        System.out.print(s);
        for(int i=1;i<=n;i++)
        {
            System.out.print(str);
        }
    }
}
