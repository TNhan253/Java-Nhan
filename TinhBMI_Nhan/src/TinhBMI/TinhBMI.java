package TinhBMI;
import java.util.Scanner;
public class TinhBMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); {
			String thongBao = null;
			System.out.print("Nhập họ tên: ");
			String hoTen = scanner.nextLine();
			System.out.print("Nhập chiều cao m: ");
			double chieuCao = scanner.nextDouble();
			System.out.print("Nhập cân nặng Kg :");
			double canNang = scanner.nextDouble();
			double bmi = canNang/Math.pow(chieuCao, 2);	
			System.out.println("BMI của " + hoTen + " là: " + bmi);
			if(bmi<16) {
				thongBao = "Gầy mức độ III";}
			else if(bmi<17) 
			{ thongBao = "Gầy mức độ II";}
			else if
			(bmi<18.5) { thongBao = "Gầy mức độ I";}
			else if(bmi<25) 
			{thongBao = "Bình thường";}
			else if(bmi<30) 
			{thongBao = "Thừa cân";}
			else if(bmi<35) 
			{thongBao = "Béo phì mức độ I";}
			else if(bmi<40) 
			{thongBao = "Béo phì mức độ II";}
			else if(bmi>16) 
			{thongBao = "Béo phì mức độ III";}		
			System.out.println(thongBao);
			//-------------------------------
			System.out.println("------------------------------------");
		}
	}

}
