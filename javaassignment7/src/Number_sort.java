import java.util.Scanner;

public class Number_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of inputs:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order:");
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.println(arr[i] + " ");
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        if(sum>15)
        {
            System.out.println("sum of even number is:"+sum);
            System.out.println("true");
        }
        else
        {
            System.out.println("sum of even number is:"+sum);
            System.out.println("False");
        }
    }
}
