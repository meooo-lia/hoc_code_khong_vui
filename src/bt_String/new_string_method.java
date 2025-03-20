/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bibau
 */
public class new_string_method {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chuoi ky tu");
        String name = sc.nextLine();
        System.out.println(" Nhap ky tu ma ban muon");
        char name_1 = sc.next().charAt(0);
        boolean flag = true;
        while (flag == true) {
            if (check(name_1) == true) {
                flag = false;
            } else {
                System.out.println("yeu cau nhap lai ");
                name_1 = sc.next().charAt(0);
            }
        }
        sum(name, name_1);
    }

    public static boolean check(char name) {
        String regex = "^[A-Za-z]$";
        Pattern pt = Pattern.compile(regex);
        CharSequence char_1 = String.valueOf(name);
        Matcher mt = pt.matcher(char_1);
        if (mt.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void sum(String name, char Special) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == Special) {
                count++;
            }
        }
        System.out.println("Tong so ky tu la " + count);
    }
}
