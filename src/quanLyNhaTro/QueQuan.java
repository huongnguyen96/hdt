package quanLyNhaTro;

import java.util.Scanner;

public class QueQuan {
	public String xa;
	public String huyen;
	public String tinh;
	public QueQuan(){
		
	}
	public QueQuan(String xa, String huyen, String tinh){
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	public void nhaptinh(){
		Scanner input = new Scanner(System.in);
		System.out.println("nhap xa: ");
		xa = input.nextLine();
		System.out.println("nhap huyen: ");
		huyen = input.nextLine();
		System.out.println("nhap tinh: ");
		tinh = input.nextLine();
		
	}
	public void hienthi(){
		System.out.println("xa "+this.xa +"huyen "+this.huyen+"tinh "+this.tinh);
	}

}
