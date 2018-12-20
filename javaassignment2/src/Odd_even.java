import java.util.Scanner;

public class Odd_even {
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Number;");
        int n=reader.nextInt();
        if(n%2==0)
        {
            if (n > 20 && n < 30)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Even Number");
            }
        }
        else
        {
            if (n > 20 && n < 30)
            {
                System.out.println("Tom");
            }
            else
            {
                System.out.println("odd number");
            }
        }
    }
}
