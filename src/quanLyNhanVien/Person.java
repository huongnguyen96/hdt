package quanLyNhanVien;

import java.util.Scanner;

public class Person {
	private String name;
	private String add;
	private String ID;
	
	
	public Person(){
		
	}
	public Person(String name,String add, String ID){
		this.name = name;
		this.add = add;
		this.ID = ID;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void nhap(){
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.name = input.nextLine();
		System.out.println("nhap dia chi: ");
		this.add = input.nextLine();
		System.out.println("nhap ID: ");
		this.ID = input.nextLine();
	
	}
	
	public void hienthi(){
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.add);
		System.out.println("ID: "+this.ID);
	}

}
