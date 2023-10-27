package javatask;

import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        String prime = "";
        System.out.println("enter value of n=");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                prime = prime + i+" , ";
            }
        }
        System.out.println("prime numbers from 1 to " + n + " are=");
        System.out.println(prime);

    }
}
