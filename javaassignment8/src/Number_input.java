import java.util.Scanner;

public class Number_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number either in 1-50 or in 1-100:");
        while (true){
            int n=sc.nextInt();
            if(n>=1&&n<=100)
            {
                System.out.println("Number guessed matches the original number");
                break;

            }
            else if(n<1)
            {
                System.out.println("Number guessed is less than original number");
            }
            else if(n>100)
            {
                System.out.println("Number guessed is more than original number");
            }
        }
    }
}
