import java.util.Scanner;

public class Unspecified_output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;



        System.out.println("Enter the number: ");
        int number;

        while ((number = input.nextInt()) != 0) {
            total += number;
        }
        System.out.println(total);
    }
}
