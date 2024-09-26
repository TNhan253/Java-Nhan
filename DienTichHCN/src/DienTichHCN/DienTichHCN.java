package DienTichHCN;
import java.util.Scanner;
public class DienTichHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc = new Scanner(System.in);
		// Diện tích HCn= dài * rộng
		System.out.println("Nhập chiều dài hcn (m): + ");
		System.out.println("Nhập chiều rộng hcn (m): + ");
		double r = abc.nextDouble();
		double d = abc.nextDouble();
		//Công thức
		double s = d*r;
		//Xuất kết quả
		System.out.println("Diện tích hình chữ nhật là: " + s +" m^2");
	}

}
