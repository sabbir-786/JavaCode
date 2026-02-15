//Print numbers from 1 to N


import java.util.Scanner;

class PrintN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        System.out.println("Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
