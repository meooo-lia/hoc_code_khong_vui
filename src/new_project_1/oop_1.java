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
                case 6:
                    update();
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("1. Them nhan vien ");
        System.out.println("2. Hien thi nhan vien ");
        System.out.println("3. Xoa nhan vien  ");
        System.out.println("4. Tinh tong luong ");
        System.out.println("5. Thoat  ");
        System.out.println("6. update nhan vien");

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
            System.out.print("id:" + f.getId());
            System.out.print(" Ten: " + f.getName());
            System.out.print(" Tuoi:" + f.getAge());
            System.out.print(" Luong:" + f.getSalary());
            System.out.print(" Thuong: " + f.getBonus());
            System.out.println(" Phat:" + f.getPenalty());

        }
        System.out.println("2.Danh sach parttime");
        for (PartTimeEmployee p : partTimeList) {
            System.out.print("id:" + p.getId());
            System.out.print(" Ten: " + p.getName());
            System.out.print(" Tuoi:" + p.getAge());
            System.out.print(" Luong theo gio:" + p.getHourlyRate());
            System.out.println(" so gio lam: " + p.getHoursWork());

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
                    if (ite.next().getId() == id) {
                        ite.remove();
                    }
                }

                break;
        }

    }

    public static void sum() {
        System.out.println("Danh sach nhan vien fullTime");
        for (FullTimeEmployee fullTimeEmployee : fullTimeList) {
            double sumfull;
            double a = fullTimeEmployee.getPenalty();
            double b = fullTimeEmployee.getSalary();
            double c = fullTimeEmployee.getBonus();
            sumfull = b + c - a;

            System.out.print("Ten: " + fullTimeEmployee.getName());
            System.out.println(" Thu nhap: " + sumfull);
        }
        System.out.println("Danh sach nhan vien partTime");
        for (PartTimeEmployee part : partTimeList) {
            double sumfull;
            double timeWork = part.getHoursWork();
            double rate = part.getHourlyRate();
            sumfull = timeWork * rate;
            System.out.print("Ten: " + part.getName());
            System.out.println(" Thu nhap: " + sumfull);
        }
    }

    public static void update() {

        show();
        System.out.println("vui long chon kieu nv");
        int choice = scnr.nextInt();
        System.out.println("vui long chon nv");
        int id = scnr.nextInt();
        switch (choice) {
            case 1:
                for (FullTimeEmployee fullTimeEmployee : fullTimeList) {
                    if (id == fullTimeEmployee.getId()) {
                        System.out.println("Nhap ten nhan vien");
                        scnr.nextLine();
                        String name = scnr.nextLine();
                        System.out.println("Nhap tuoi nhan vien");
                        int age = scnr.nextInt();
                        System.out.println("Nhap luong nhan vien");
                        double salary = scnr.nextDouble();
                        System.out.println("Nhap thuong nhan vien");
                        double bonus = scnr.nextDouble();
                        System.out.println("Nhap phat nhan vien");
                        double panalty = scnr.nextDouble();
                        fullTimeEmployee.setName(name);
                        fullTimeEmployee.setAge(age);
                        fullTimeEmployee.setSalary(salary);
                        fullTimeEmployee.setBonus(bonus);
                        fullTimeEmployee.setPenalty(panalty);
                    }
                }

                break;
            case 2:
                for (PartTimeEmployee part : partTimeList) {
                    if (id == part.getId()) {
                        System.out.println("Nhap ten nhan vien");
                        scnr.nextLine();
                        String name = scnr.nextLine();
                        System.out.println("Nhap tuoi nhan vien");
                        int age = scnr.nextInt();
                        System.out.println("Nhap so gio lam viec  ");
                        int hoursWork = scnr.nextInt();
                        System.out.println("Luong theo gio  ");
                        double hourlyRate = scnr.nextDouble();
                        part.setName(name);
                        part.setAge(age);
                        part.setHoursWork(hoursWork);
                        part.setHourlyRate(hourlyRate);
                    }
                }
                break;
        }
    }
}
