package quanLyNhaTro;

import java.util.Scanner;

public class HoTen {
	public String firstname;
	public String lastname;
	public HoTen(){
		
	}
	public HoTen(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void nhapten(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap firstname: ");
		this.firstname = scanner.nextLine();
		System.out.println("nhap lastname: ");
		this.lastname = scanner.nextLine();
		
	}
	public void hienthiten(){
		System.out.println("Name: "+this.lastname+this.firstname);
	}

}
