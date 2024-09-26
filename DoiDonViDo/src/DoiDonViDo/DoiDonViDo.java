package DoiDonViDo;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner abc = new Scanner(System.in);
////Câu hướng dân người dùng
//System.out.print("Nhập số USD cần đổi: ");
//double usd = abc.nextDouble();
//double vnd = usd * 24615;
////Xuất ra tiền VNĐ
//System.out.println(usd + " USD = " + vnd + " VNĐ");
		Scanner scanner = new Scanner(System.in);
		int chon;

		do {
			System.out.println("----------------------------------");
			System.out.println("========== ĐỔI NGOẠI TỆ ==========");
		    System.out.println("----------------------------------");
		    System.out.println("1. USD ---> VNĐ");
		    System.out.println("2. EUR ---> VNĐ");
		    System.out.println("3. GBP ---> VNĐ");
		    System.out.println("4. JPY ---> VNĐ");
		    System.out.println("5. AUD ---> VNĐ");
		    System.out.println("6. SGD ---> VNĐ");
		    System.out.println("7. THB ---> VNĐ");
		    System.out.println("8. CAD ---> VNĐ");
		    System.out.println("9. CHF ---> VNĐ");
		    System.out.println("10. Thoát");
		    System.out.print("Nhập lựa chọn của bạn: ");
		    chon = scanner.nextInt();

		    switch (chon) 
		    {
		        case 1:
		            DoLaMyToVND();
		            break;
		        case 2:
		            UEROToVND();
		            break;
		        case 3:
		        	JAPANESEYENToVND();
		            break;
		        case 4:
		        	AUSTRALIANDOLLARToVND();
		            break;
		        case 5:
		        	SINGAPOREDOLLARToVND();
		            break;
		        case 6:
		        	THAIBAHTToVND();
		            break;
		        case 7:
		        	CANADIANDOLLARToVND();
		            break;
		        case 8:
		        	SWISSFRANCToVND();
		            break;
		        case 9:
		        	HONGKONGDOLLARToVND();
		            break;
		        case 10:
		            System.out.println("Kết thúc!");
		            break;
		        default:
		            System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
		    }
		}
		while (chon != 10);
		}
			public static void DoLaMyToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số USD: ");
				double usd = scanner.nextDouble();
				double vnd = usd*24430;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(usd +" USD = " + vnd + " VNĐ");		
			}
			public static void UEROToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số Euro: ");
				double euro = scanner.nextDouble();
				double vnd = euro*26736.66;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(euro +" EURO = " + vnd + " VNĐ");
			}
			public static void JAPANESEYENToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số Yên Nhật: ");
				double yen = scanner.nextDouble();
				double vnd = yen*164.08;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(yen +" YÊN = " + vnd + " VNĐ");
			}
			public static void AUSTRALIANDOLLARToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số ĐôLa Úc: ");
				double dluc = scanner.nextDouble();
				double vnd = dluc*16419.73;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(dluc +" ĐôLa Úc = " + vnd + " VNĐ");
			}
			public static void SINGAPOREDOLLARToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số ĐôLa Singapore: ");
				double sgp = scanner.nextDouble();
				double vnd = sgp*18649.56;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(sgp +" ĐôLa Singapore = " + vnd + " VNĐ");
			}
			public static void THAIBAHTToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số Bat TháiLan: ");
				double thai = scanner.nextDouble();
				double vnd = thai*665.36;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(thai +" BATThái = " + vnd + " VNĐ");
			}
			public static void CANADIANDOLLARToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số ĐôLa Canada: ");
				double cnd = scanner.nextDouble();
				double vnd = cnd*17821.55;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(cnd +" ĐôLa Canada = " + vnd + " VNĐ");
			}
			public static void SWISSFRANCToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số Đồng Thụy sĩ: ");
				double ts = scanner.nextDouble();
				double vnd = ts*28249.79;
				//Xuất ra màn hình
				System.out.println(ts +" Đồng Thụy sĩ = " + vnd + " VNĐ");
			}
			public static void HONGKONGDOLLARToVND() 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập vào số ĐôLa Hồng Kông: ");
				double hk = scanner.nextDouble();
				double vnd = hk*3083.46;
				//Xuất ra màn hình
				System.out.println("----------------------------------");
				System.out.println(hk +" ĐôLa HồngKông = " + vnd + " VNĐ");
			}
	}

