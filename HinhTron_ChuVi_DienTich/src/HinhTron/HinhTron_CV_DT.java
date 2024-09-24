package HinhTron;

import java.util.Scanner;

public class HinhTron_CV_DT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập bán kính: ");
		double banKinh = scanner.nextDouble();
		double duongKinh = banKinh*2;
		double chuVi = duongKinh*Math.PI;
		double dienTich = Math.pow(banKinh,2)*3.14;
		// Xuất ra màn hình
		System.out.println("==============================");
		System.out.println("Chu vi hình tròn: " + chuVi);
		System.out.println("Diện tích hình tròn: " + dienTich);
	}

}
