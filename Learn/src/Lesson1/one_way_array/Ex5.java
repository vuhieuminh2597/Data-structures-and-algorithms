package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex5 {
    //Bài 5. Xóa tất cả các phần tử có giá trị x khỏi mảng n phần tử các số nguyên.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kit test:");
        int t = input.nextInt();
        int[] arr;
        int x;
        int n;
        while (t > 0) {
            System.out.println("Nhập số phần tử mảng:");
            n = input.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Phần tử thứ " + i + ":");
                arr[i] = input.nextInt();
            }
            showElement(arr);
            System.out.println("Nhập giá trị cần xóa:");
            x = input.nextInt();
            removeElement(arr, x);
            t--;
        }
    }

    private static void showElement(int[] arr) {
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void showElement2(int[] arr, int count) {
        System.out.println("Các phần tử trong mảng:");
        for (int i = count; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void removeElement(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                for (int j = 0; j < i; j++) {
                    var tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                count++;
            }
        }
        showElement2(arr, count);
    }
}
