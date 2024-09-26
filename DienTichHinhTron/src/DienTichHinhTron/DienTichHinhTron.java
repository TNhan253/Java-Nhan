package DienTichHinhTron;

import java.util.Scanner;

public class DienTichHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner abc = new Scanner(System.in);
//Hướng dẫn người dùng nhập dữ liệu
//Diện tích hình tròn = PI.R^2
System.out.print("Nhập bán kính hình tròn (m): ");
double r = abc.nextDouble();
//Công thức tính
double s = Math.PI * Math.pow(r,2);
//Xuất ra kết quả
System.out.println("Diện tích hình tròn có bán kính " + r + " m là: " + s +" m^2");
	}

}
