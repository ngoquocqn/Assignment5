package baitapbuoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            number.add(scanner.nextInt());
        }
        return number;
    }

    // Method xuất mảng ra màn hình
    public static void printData(ArrayList<Integer> number) {
        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i) + " ");
        }
        System.out.println();
    }

    // Method tìm giá trị phần tử lớn thứ 2 trong mảng
    public static int findMax2(ArrayList<Integer> number) {
        if (number.size() < 2) {
            System.out.println("Mang khong du phan tu de tim gia tri lon thu 2.");
            return Integer.MIN_VALUE;
        }

        int max1 = 0, max2 = 0;

        for (int i = 0; i < number.size(); i++) {
            int num = number.get(i);
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        return max2;
    }

    // Method xoá các phần tử lẻ ra khỏi mảng
    public static void deleteOddNumber(ArrayList<Integer> number) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0) {
                arr1.add(number.get(i));
            }
        }
        number.clear();
        number.addAll(arr1);
        
    }
}
