package quanLyNhaTro;

public class Nguoi {
	private HoTen hoTen;
	private NgaySinh ngaySinh;
	private QueQuan queQuan;
	
	public Nguoi(){
		
	}
	public Nguoi(HoTen hoTen, NgaySinh ngaySinh, QueQuan queQuan){
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}
	public HoTen getHoTen() {
		return hoTen;
	}
	public void setHoTen(HoTen hoTen) {
		this.hoTen = hoTen;
	}
	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public QueQuan getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(QueQuan queQuan) {
		this.queQuan = queQuan;
	}
	
	public static void main(String[] args) {
		Nguoi nguoi = new Nguoi();
		nguoi.hoTen.nhapten();
		nguoi.ngaySinh.nhapdob();
		nguoi.queQuan.nhaptinh();
	}
	

}
