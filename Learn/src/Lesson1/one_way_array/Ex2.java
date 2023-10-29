package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex2 {
    //Bài 2. Kiểm tra mảng đối xứng. Mảng đối xứng a là mảng thỏa mãn a[i] = a[length-1-i] với length
    //là số phần tử hiện có của mảng.
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
            if (arr.length < 2){
                System.out.println("Số phần tử nhỏ hơn 2!");
                break;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập giá trị thứ " + i + ":");
                arr[i] = input.nextInt();
            }
            var a = check(arr) ? "Yes" : "No";
            System.out.println(a);
            t--;
        }
    }

    private static boolean check(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
