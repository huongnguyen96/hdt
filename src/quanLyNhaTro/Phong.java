package quanLyNhaTro;

import java.util.Scanner;

public class Phong {
	public int gia;
	public int giaDien;
	public int giaNuoc;
	public int dienTich;
	
	public Phong(){
		
	}
	public Phong(int gia, int giaDien, int giaNuoc, int dienTich){
		this.gia = gia;
		this.giaDien = giaDien;
		this.giaNuoc = giaNuoc;
		this.dienTich = dienTich;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getGiaDien() {
		return giaDien;
	}
	public void setGiaDien(int giaDien) {
		this.giaDien = giaDien;
	}
	public int getGiaNuoc() {
		return giaNuoc;
	}
	public void setGiaNuoc(int giaNuoc) {
		this.giaNuoc = giaNuoc;
	}
	public int getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	public void nhapgia(){
		Scanner input1 = new Scanner(System.in);
		System.out.println("nhap dien tich: ");
		this.dienTich = input1.nextInt();
		System.out.println("nhap gia phong: ");
		this.gia = input1.nextInt();
		System.out.println("nhap gia dien: ");
		this.giaDien = input1.nextInt();
		System.out.println("nhap gia nuoc: ");
		this.giaNuoc = input1.nextInt();
		
	}
	public void hienthigia(){
		System.out.println("dien tich: "+this.dienTich);
		System.out.println("Gia phong: "+this.gia);
		System.out.println("Gia dien: "+this.giaDien);
		System.out.println("Gia nuoc: "+this.giaNuoc);
	}
	

}
