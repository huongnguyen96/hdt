package quanLyNhanVien;

import java.util.Scanner;

public class Staff extends Person{
	public double salary;
	public Staff(){
		
	}
	public Staff(String name, String add, String ID, double salary){
		super(name, add, ID);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap luong: ");
		this.salary = scanner.nextDouble();
	}
	public void output(){
		System.out.println("Staff: "+this.salary);
	}
	
	public static void main(String[] args) {
		int nstaff;
		System.out.println(" nhap so nv: ");
		Scanner scanner1 = new Scanner(System.in);
		nstaff = scanner1.nextInt();
		Staff[] liststaff = new Staff[100];
		int[] Luong = new int[100];
		for(int i=0;i<nstaff;i++){
			Staff staff = new Staff();
			staff.nhap();
			staff.input();
			liststaff[i] = staff;
			
		}
	}

}
