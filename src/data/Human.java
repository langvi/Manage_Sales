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
public class Human {
    private String name, id, phoneNumber, address;
    private String birthday;
    Scanner scanner = new Scanner(System.in);
    
    public Human(){
        super();
    }
    
    public Human(String mname, String mid, String mphoneNumber, 
            String maddress, String mbirthday){
        super();
        this.id = mid;
        this.name = mname;
        this.phoneNumber = mphoneNumber;
        this.address = maddress;
        this.birthday = mbirthday;         
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getbirthday() {
        return birthday;
    }

    public void setbirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public void nhap(){
        System.out.print("Mã ID: ");
        id = scanner.nextLine();
        System.out.print("Họ tên: ");
        name = scanner.nextLine();
        System.out.print("Ngày tháng năm sinh: ");
        birthday = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        address = scanner.nextLine();
    }
    
    public String toString(){
        return "Mã ID: " + this.id + ". họ tên: " + this.name + 
                ", ngày tháng năm sinh: " + this.birthday + ", số điện thoại: "
                + this.phoneNumber + ", địa chỉ: " + this.address;
    }
    
}
