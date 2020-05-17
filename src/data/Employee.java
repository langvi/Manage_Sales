/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Employee extends Human{
    private String mail, hourShift;

    public String getHourShift() {
        return hourShift;
    }

    public void setHourShift(String hourShift) {
        this.hourShift = hourShift;
    }
    protected int salary, basicSalary, shift, extendShift;
    
    public Employee(){
        super();
    }

    public Employee(String mmail, int msalary, int mbasicSalary, int mshift,
                    int mextendShift, String mhourShift){
        super();
        this.mail = mmail;
        this.salary = msalary;
        this.shift = mshift;
        this.extendShift = mextendShift;
        this.hourShift = mhourShift;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getExtendShift() {
        return extendShift;
    }

    public void setExtendShift(int extendShift) {
        this.extendShift = extendShift;
    }
    
    public void nhap(){
        super.nhap();
        System.out.print("Email: ");
        mail = scanner.nextLine();
        System.out.print("Mức lương cơ bản: ");
        basicSalary = scanner.nextInt();
        System.out.print("Giờ làm việc: ");
        hourShift = scanner.nextLine();
        System.out.print("Số ca làm việc: ");
        shift = scanner.nextInt();
        System.out.print("Số ca làm thêm: ");
        extendShift = scanner.nextInt();
    }
    
    public String toString(){
        return super.toString() + ", email: " + this.mail 
                + ", mức lương cơ bản: " + this.basicSalary 
                + ", giờ làm việc: " + this.hourShift 
                + ", số ca làm việc: " + this.shift
                + ", số ca làm thêm: " + this.extendShift;
    }
            
    public int computeSalary(){
        this.salary = (this.shift + this.extendShift) * this.basicSalary;
        return this.salary;
    }
    
}
