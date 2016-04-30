package tinhtuoi;

import java.util.Scanner;

public class Nguoi {
	public String name;
	public String bod;
	
	public Nguoi(){
		
	}
	public Nguoi(String name, String bod){
		this.name = name;
		this.bod = bod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	
	/*public void nhap(){
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ten: ");
		name = input.nextLine();
		System.out.println("nhap ngay thang nam: ");
		bod = input.nextLine();
	}*/
	public void xuly(){
		bod = "ngay hai muoi thang nam nam mot chin chin sau";
		System.out.println(bod.substring(bod.indexOf("ngay")+5, bod.lastIndexOf("thang")));
		System.out.println(bod.substring(bod.indexOf("thang")+6));
		
		
	}
	public static void main(String[] args) {
		Nguoi nguoi = new Nguoi();
		nguoi.xuly();
	}

}
