/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

import java.util.Scanner;

/**
 *
 * @author bibau
 */
public class thuc_hanh {

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu mang");
        int count = enterInput("Vui long nhap lai ");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("nhap phan tu thu " + (i + 1));
            array[i] = enterInput("nhap so nguyen duong");
        }
        tinhTong(array);
    }
    
    public static void tinhTong(int[] array) {
        int tong = 0;
        for (int i = 0; i < array.length; i++) {
            tong += array[i];
        }
        System.out.println("tong cua ban la " + tong);
    }

    public static int enterInput(String msg) {
        String a = scnr.nextLine();
        int c = Integer.parseInt(a);
        while (c < 0) {
            System.out.println(msg);
            c = Integer.parseInt(scnr.nextLine());
        }
        return c;
    }
}
