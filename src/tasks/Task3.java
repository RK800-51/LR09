package tasks;

import java.util.Scanner;

public class Task3 {
    private static int n;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        arr = new int[n];
        insert(n);
        printArr(arr, n);
    }
    public static void insert(int n) {
        if (n == 0) {
            arr[n] = n;
        }
        else {
            n--;
            arr[n] = n;
            insert(n);
        }
    }
    public static void printArr(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        else {
            n--;
            printArr(arr, n);
            System.out.println(arr[n]);

        }
    }
}
