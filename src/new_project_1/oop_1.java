/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package new_project_1;

import Model.Employee;
import Model.FullTimeEmployee;
import Model.PartTimeEmployee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bibau
 */
public class oop_1 {

    static ArrayList<FullTimeEmployee> fullTimeList = new ArrayList<>();
    static ArrayList<PartTimeEmployee> partTimeList = new ArrayList<>();

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            System.out.println("Vui long chon tac vu");
            int choice = scnr.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    sum();
                    break;
                case 5:
                    System.exit(0);

            }

        }
    }

    public static void menu() {
        System.out.println("1. Them nhan vien ");
        System.out.println("2. Hien thi nhan vien ");
        System.out.println("3. Xoa nhan vien  ");
        System.out.println("4. Tinh tong luong ");
        System.out.println("5. Thoat  ");

    }

    public static void add() {
        System.out.println("Vui long chon");
        System.out.println("1. fulltime");
        System.out.println("2. parttime");
        int choice = scnr.nextInt();
        switch (choice) {
            case 1:
                fullTime();
                break;
            case 2:
                partTime();
                break;

        }

    }

    public static void fullTime() {

        System.out.println("Nhap ten nhan vien");
        scnr.nextLine();
        String name = scnr.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        int age = scnr.nextInt();
        System.out.println("Nhap luong nhan vien");
        double salary = scnr.nextDouble();
        double bonus = 0;
        double panalty = 0;

        FullTimeEmployee fullTime = new FullTimeEmployee(salary, bonus, panalty, name, age);
        fullTimeList.add(fullTime);
    }

    public static void partTime() {

        System.out.println("Nhap ten nhan vien");
        scnr.nextLine();
        String name = scnr.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        int age = scnr.nextInt();
        System.out.println("Nhap so gio lam viec  ");
        int hoursWork = scnr.nextInt();
        System.out.println("Luong theo gio  ");
        double hourlyRate = scnr.nextDouble();
        PartTimeEmployee partTime = new PartTimeEmployee(hoursWork, hourlyRate, name, age);
        partTimeList.add(partTime);
    }

    public static void show() {
        System.out.println("1.Danh sach fulltime");
        for (FullTimeEmployee f : fullTimeList) {
            System.out.println("id:" + f.getId() + " " + f.getName());

        }
        System.out.println("2.Danh sach parttime");
        for (PartTimeEmployee p : partTimeList) {
            System.out.println("id:" + p.getId() + " " + p.getName());
        }
    }

    public static void delete() {
        show();
        System.out.println("Vui long chon kieu nhan vien ban muon xoa");
        int index;
        int choice = scnr.nextInt();
        System.out.println("chon nhan vien ban muon xoa");
        int id = scnr.nextInt();
        switch (choice) {
            case 1:

                for (int i = 0; i < fullTimeList.size(); i++) {
                    if (fullTimeList.get(i).getId() == id) {
                        index = i;
                        fullTimeList.remove(index);
                    }
                }
                break;
            case 2:
                Iterator<PartTimeEmployee> ite = partTimeList.iterator();
                while (ite.hasNext()) {                    
                    if (ite.next().getId()==id){
                        ite.remove();
                    }
                }
               
                break;
        }

    }

    public static void sum() {

    }

}
