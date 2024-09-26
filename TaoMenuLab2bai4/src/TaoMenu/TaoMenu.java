package TaoMenu;

import java.util.Scanner;

public class TaoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner abc = new  Scanner(System.in);
int chon;
do
{
	System.out.println("--------------------------------");
	System.out.println("+++++MENU++++++");
	System.out.println("1. Giải phương trình bậc 1");
	System.out.println("2. Giải phương trình bậc 2");
	System.out.println("3. Tính tiền điện");
	System.out.println("4. Kết thúc");
	 System.out.print("Nhập lựa chọn của bạn: ");
	chon = abc.nextInt();
	switch(chon)
	{
	case 1:
		phuongtrinhbac1();
		break;
	case 2:
		phuongtrinhbac2();
		break;
	case 3:
		tiendien();
		break;
	case 4:
		System.out.print("Thoát");
		break;
	 default:
         System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
	}	
}
while(chon !=4);
}
	public static void phuongtrinhbac1()
	{
		System.out.println("--------------------------------");
		Scanner abcd = new Scanner(System.in);
		//Phương trình bậc 1 có dạng ax + b = 0
		System.out.print("Nhập a: ");
		double a = abcd.nextDouble();
		System.out.print("Nhập b: ");
		double b = abcd.nextDouble();
		//double x;
		if (a == 0)
		{
		  if (b==0) {System.out.print("Phương trình có vô số nghiệm");}	
		}
		else {
			double x = -b/a;
			System.out.println("Phương trình có 1 nghiệm: x = " + x );
			System.out.println("--------------------------------");
		}
	}
	public static void phuongtrinhbac2()
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("--------------------------------");
		//Phương trình bậc 2 có dạng aX^2 + bX + C = 0
		//Cách giải
		//B1: Tính Delta = b^2 - 4*a*c
		//Nhập a
		System.out.print("Nhập a: ");
		int a = abc.nextInt();
		//Nhập b
		System.out.print("Nhập b: ");
		int b = abc.nextInt();
		//Nhập c
		System.out.print("Nhập c: ");
		int c = abc.nextInt();
		double Delta = Math.pow(b,2) - 4*a*c;
		System.out.println("Delta = " + Delta);
		//Xét điều kiện Delta
				if (Delta > 0) //Nếu Delta > 0 thì phương trình có 2 nghiệm phân biệt 
					{
						double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
						double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
						System.out.println("Phương trình có 2 nghiệm phân biệt:");
						System.out.println("x1 = " + x1);
						System.out.println("x2 = " + x2);
					} 
				else if (Delta == 0) //Nếu Delta = 0 thì phương trình có nghiệm kép 
					{
						double x = -b / (2 * a);
						System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
					}
				else //Trường hợp khác có nghĩa Delta < 0 thì phương trình vô nghiệm
				{
					System.out.println("Phương trình vô nghiệm");
				}
	}
	public static void tiendien()
	{
		System.out.println("--------------------------------");
//		System.out.println("Code tính tiền điện");
		//Khai báo Scanner
		Scanner abc = new Scanner(System.in);
		//Cho người dùng nhập chỉ số cũ
		System.out.print("Nhập vào chỉ số cũ: ");
		int chiSoCu = abc.nextInt();
		//Cho người dùng nhập chỉ số mới
		System.out.print("Nhập vào chỉ số mới: ");
		int chiSoMoi = abc.nextInt();
		System.out.print("Nhập vào đơn giá điện: ");
		int donGia = abc.nextInt(); 
		int kwDienSD = chiSoMoi - chiSoCu;
		double thanhTien; //Khai báo kiểu dữ liệu là double do 
		//thanhTien = (50*donGia) + ((kwDienSD - 50)*0.2*donGia) = một số thập phân
		//Công thức tính tiền điện
		if(kwDienSD<50) 
		{
			thanhTien = kwDienSD* donGia;	
		}
		else 
		{
			thanhTien = (50*donGia) + ((kwDienSD - 50)*0.2*donGia);
		}
		//Xuất ra cho người dung
		System.out.println("Tiền điện phải thanh toán (VNĐ): " + thanhTien);
		System.out.println("--------------------------------------------------");
	}
}
