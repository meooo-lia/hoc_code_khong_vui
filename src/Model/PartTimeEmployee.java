/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bibau
 */
public class PartTimeEmployee extends Employee{
     private static int count = 1;
    private int hoursWork;
    private double hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int hoursWork, double hourlyRate) {
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(int hoursWork, double hourlyRate, String name, int age) {
        super( count++,name, age);
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
      
}
