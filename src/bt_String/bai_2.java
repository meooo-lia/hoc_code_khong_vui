/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_String;

import java.util.Scanner;

/**
 *
 * @author bibau
 */
public class bai_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so luoong");
        int num = sc.nextInt();
        String[] list = new String[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap chuoi thu" + (i+1));
            sc.nextLine();
            String name = sc.nextLine();
            list[i] = name;
           }               
        System.out.println("Nhap chuoi can tim");
        String name_check = sc.nextLine();        
        search(list,name_check);
    }

    public static void search(String [] list, String name) {
        for (String s : list) {
            if (s.contains(name)==true){
                System.out.println(s);
            }
        }
    }
}   
//ngu