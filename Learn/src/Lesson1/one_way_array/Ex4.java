package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex4 {
    //Bài 4. Chèn giá trị x vào vị trí k mảng gồm n phần tử các số nguyên. Nếu k <= 0 chèn vào đầu
    //mảng. Nếu k >= n, chèn vào cuối mảng.
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập kit test:");
        var t = input.nextInt();
        int n;
        int k;
        int x;
        while (t > 0) {
            System.out.println("Nhập số phần tử mảng:");
            n = input.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("Phần tử thứ " + i + ":");
                arr[i] = input.nextInt();
            }
            showElement(arr);
            System.out.println("Giá trị cần chèn vào mảng:");
            x = input.nextInt();
            System.out.println("Vị trí cần chèn:");
            k = input.nextInt();
            insertElement(arr, x, k);
            showElement2(arr);
            t--;
        }
    }

    private static void showElement(int[] arr) {
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void showElement2(int[] arr) {
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void insertElement(int[] arr, int x, int k) {
        if (k <= 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = x;
        } else if (k >= arr.length) {
            arr[arr.length - 1] = x;
        } else {
            for (int i = arr.length - 1; i > k; i--) {
                arr[i] = arr[i - 1];
            }
            arr[k] = x;
        }
    }
}
