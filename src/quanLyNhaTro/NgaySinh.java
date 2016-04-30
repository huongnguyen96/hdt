package quanLyNhaTro;

import java.util.Scanner;

public class NgaySinh {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgaySinh(){
		
	}
	public NgaySinh(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public void nhapdob(){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("nhap ngay: ");
		this.ngay = scanner1.nextInt();
		System.out.println("nhap thang: ");
		this.thang = scanner1.nextInt();
		System.out.println("nhap nam: ");
		this.nam = scanner1.nextInt();
	}
	public void hienthidob(){
		System.out.println("Ngay sinh: "+this.ngay+this.thang+this.nam);
	}

}
