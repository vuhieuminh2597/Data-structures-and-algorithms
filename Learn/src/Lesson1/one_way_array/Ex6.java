package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex6 {
    //Bài 6. Tính tổng các phần tử lớn hơn phần tử liền trước trong mảng n phần tử.VD:123 => 2 > 1, 3 > 2.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kit test:");
        int t = input.nextInt();
        int[] arr;
        int n;
        while (t > 0) {
            System.out.println("Nhập số phần tử mảng:");
            n = input.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Phần tử thứ " + i + ":");
                arr[i] = input.nextInt();
            }
            calcu(arr);
            t--;
        }
    }

    private static void calcu(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                sum += arr[i + 1];
            }
        }
        System.out.println("Sum= " + sum);
    }
}
