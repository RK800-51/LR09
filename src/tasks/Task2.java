package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(intToBin(n));
    }
    public static String intToBin(int n) {
        if (n / 2 == 0) {
            return Integer.toString(n % 2);
        }
        else {
            return "" + intToBin(n / 2) + n % 2;
        }
    }
}
