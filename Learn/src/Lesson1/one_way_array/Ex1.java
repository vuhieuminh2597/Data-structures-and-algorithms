package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex1 {
    //Bài 1. Liệt kê tất cả các số nguyên tố trong mảng.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lần test:");
        int t = input.nextInt();
        int n;
        int[] arr;
        while (t > 0) {
            System.out.println("Nhập số phần tử mảng");
            n = input.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập giá trị thứ " + i + ":");
                arr[i] = input.nextInt();
            }
            checkPrime(arr);
            t--;
        }
    }

    private static boolean isPrime(int n) {
        if (n >= 2) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return true;
                }
            }
        } else {
            return true;
        }
        return false;
    }

    private static void checkPrime(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (!isPrime(arr[i])){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
