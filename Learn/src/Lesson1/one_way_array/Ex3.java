package Lesson1.one_way_array;

import java.util.Scanner;

public class Ex3 {
    //Bài 3. Sắp xếp các từ trong câu theo thứ tự tăng dần a-z.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lần test:");
        int t = input.nextInt();
        input.nextLine();
        String arr;
        while (t > 0){
            System.out.println("Nhập chuỗi ký tự:");
            arr = input.nextLine();
            showResult(sortWord(arr));
            t--;
        }
    }

    private static String[] splitWord(String str) {
        if (str != null) {
            return str.split("\\s+");
        }
        return null;
    }


    private static String[] sortWord(String str) {
        var a = splitWord(str);
        if (str != null) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].compareTo(a[j]) > 0) {
                        var read = a[i];
                        a[i] = a[j];
                        a[j] = read;
                    }
                }
            }
        }
        return a;
    }

    private static void showResult(String[] str) {
        if (str != null) {
            for (var read :
                    str) {
                System.out.print(read + " ");
            }
            System.out.println();
        }
    }
}
