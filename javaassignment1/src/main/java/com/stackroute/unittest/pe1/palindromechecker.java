package main.java.com.stackroute.unittest.pe1;

import java.util.Scanner;

public class palindromechecker{
    public static void main(String[] args) {
        long rem = 0,m,a=0,count=0,sum=0,number;
        long [] numberArray=new long[50];
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        long n = reader.nextLong();
        m=n;
        while (n>0) {
            rem = n % 10;
            a=a*10+rem;
            n = n / 10;
            count++;

        }
        number=m;
        if(a==m)
        {
            while (number != 0) {
                    numberArray[(int) count] = number % 10;
                    number /= 10;
                    count++;
                }
                for (int i = 0; i < numberArray.length; i++) {
                    if (numberArray[i] % 2 == 0) {
                        sum = sum + numberArray[i];
                    }
                }
            if(sum<25)
                {
                    System.out.println(m +" the number is palindrome and the sum of even numbers is less than 25");
                }
                else {
                    System.out.println(m + " the number is palindrome and the sum of even numbers is greater than 25");
                }
        }
        else {
            System.out.println(m + " the number is  not palindrome");
        }
    }
}
