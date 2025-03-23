/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_ana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bibau
 */
public class lam_viec_voi_file {

    public static void main(String[] args) throws IOException {
        File file = createFile("emduy.txt");
        ghiFile(file.getName());
        readFile(file.getName());

    }

    public static File createFile(String file_name) throws IOException {
        File file = new File(file_name);
        if (file.createNewFile()) {
            System.out.println("File da duoc tao" + file.getName());
            return file;
        } else {
            System.out.println("File da ton tai");
            return file;
        }
    }

    public static void readFile(String file_name) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(file_name));
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);

            }
            System.out.println("da doc file");
            rd.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file");
        }
    }

    public static void ghiFile(String file_name) {
        try {
            FileWriter fw = new FileWriter(file_name);
            fw.write("toi bi ngu");
            fw.write("\n toi bi ngu lan nua");
            System.out.println("Da ghi file");
            fw.close();
        } catch (Exception ex) {
            System.out.println("Loi ghi File");
        }
    }
}
