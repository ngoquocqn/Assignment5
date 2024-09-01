package baitapbuoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int choice;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap mang so nguyen");
            System.out.println("2. Xuat mang");
            System.out.println("3. Tim phan tu lon thu 2 trong mang");
            System.out.println("4. Xoa phan tu le trong mang");
            System.out.println("5. Thoat");
            System.out.print("Chon tuy chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    NumberExercise.EnterData(number);
                    break;
                case 2:
                    NumberExercise.printData(number);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(number);
                    if (max2 != Integer.MIN_VALUE) {
                        System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(number);
                    System.out.println("Da xoa phan tu le.");
                    NumberExercise.printData(number);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tuy chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
