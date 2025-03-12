/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bibau
 */
public class FullTimeEmployee extends Employee{
     private static int count = 1;
    private double salary;
    private double bonus;
    private double penalty;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double salary, double bonus, double penalty) {
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public FullTimeEmployee(double salary, double bonus, double penalty, String name, int age) {
        super(count++, name, age);
        
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }
    
    
}
