package BAI4;

import java.util.Scanner;

public class BAI4 {

	public static void main(String[] args) {
		int choice;
		        Scanner scanner = new Scanner(System.in);

		        do {
		            choice = menu(scanner);
		            switch (choice) {
		                case 1:
		                    giaiPTB1(scanner);
		                    break;
		                case 2:
		                    giaiPTB2(scanner);
		                    break;
		                case 3:
		                    tinhTienDien(scanner);
		                    break;
		                case 4:
		                    System.out.println("Kết thúc ứng dụng.");
		                    break;
		                default:
		                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
		            }
		        } while (choice != 4);

		        scanner.close();
		    }

		    // Phương thức menu
		    public static int menu(Scanner scanner) {
		        System.out.println("+---------------------------------------------------+");
		        System.out.println("1. Giải phương trình bậc nhất");
		        System.out.println("2. Giải phương trình bậc 2");
		        System.out.println("3. Tính tiền điện");
		        System.out.println("4. Kết thúc");
		        System.out.println("+---------------------------------------------------+");
		        System.out.print("Chọn chức năng: ");
		        return scanner.nextInt();
		    }

		    // Phương thức giải phương trình bậc nhất
		    public static void giaiPTB1(Scanner scanner) {
		        System.out.print("Nhập hệ số a: ");
		        double a = scanner.nextDouble();
		        System.out.print("Nhập hệ số b: ");
		        double b = scanner.nextDouble();

		        if (a == 0) {
		            if (b == 0) {
		                System.out.println("Phương trình có vô số nghiệm.");
		            } else {
		                System.out.println("Phương trình vô nghiệm.");
		            }
		        } else {
		            double x = -b / a;
		            System.out.printf("Nghiệm của phương trình là: x = %.2f%n", x);
		        }
		    }

		    // Phương thức giải phương trình bậc hai
		    public static void giaiPTB2(Scanner scanner) {
		        System.out.print("Nhập hệ số a: ");
		        double a = scanner.nextDouble();
		        System.out.print("Nhập hệ số b: ");
		        double b = scanner.nextDouble();
		        System.out.print("Nhập hệ số c: ");
		        double c = scanner.nextDouble();

		        if (a == 0) {
		            if (b == 0) {
		                if (c == 0) {
		                    System.out.println("Phương trình có vô số nghiệm.");
		                } else {
		                    System.out.println("Phương trình vô nghiệm.");
		                }
		            } else {
		                double x = -c / b;
		                System.out.printf("Phương trình bậc nhất, nghiệm là: x = %.2f%n", x);
		            }
		        } else {
		            double delta = b * b - 4 * a * c;
		            if (delta < 0) {
		                System.out.println("Phương trình vô nghiệm.");
		            } else if (delta == 0) {
		                double x = -b / (2 * a);
		                System.out.printf("Phương trình có một nghiệm kép: x = %.2f%n", x);
		            } else {
		                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		                System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.2f, x2 = %.2f%n", x1, x2);
		            }
		        }
		    }

		    // Phương thức tính tiền điện
		    public static void tinhTienDien(Scanner scanner) {
		        System.out.print("Nhập số điện sử dụng (kWh): ");
		        double soDien = scanner.nextDouble();

		        double tien;
		        if (soDien < 0) {
		            System.out.println("Số điện sử dụng không hợp lệ.");
		        } else if (soDien <= 50) {
		            tien = soDien * 1000;
		            System.out.printf("Tiền điện phải trả là: %.2f VND%n", tien);
		        } else {
		            tien = 50 * 1000 + (soDien - 50) * 1200;
		            System.out.printf("Tiền điện phải trả là: %.2f VND%n", tien);
		        }
		    }

	}

