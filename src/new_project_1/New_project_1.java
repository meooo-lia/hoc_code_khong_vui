/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new_project_1;

import java.util.Scanner;

/**
 *
 * @author bibau
 */
public class New_project_1 {

    static Scanner scnr = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhap so a");
        int a = enterInput();
        System.out.println("Nhap so b");
        int b = enterInput();
        while (true) {
            menu();
            int choice = enterInput();
            switch (choice) {
                case 1:
                    tinhTong(a, b);
                    break;
                case 2:
                    tinhHieu(a, b);
                    break;

                case 3:
                    System.out.println("Ket thuc");
                    System.exit(0);

            }
        }
    }

    public static int enterInput() {
        String a = scnr.nextLine();
        return Integer.parseInt(a);

    }

    public static void menu() {
        System.out.println("1. Tong");
        System.out.println("2. Hieu");
        System.out.println("3. Exit");

    }

    public static void tinhTong(int a, int b) {
        System.out.println(a + b);
    }

    public static void tinhHieu(int a, int b) {
        System.out.println(a - b);
    }
}
