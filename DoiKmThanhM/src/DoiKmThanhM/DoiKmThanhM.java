package DoiKmThanhM;

import java.util.Scanner;

public class DoiKmThanhM {
public static void main(String[] args) {
	Scanner abc = new Scanner(System.in);
	System.out.print("Nhập số KM cần đổi: ");
	double km = abc.nextDouble();
	double m = km * 1000;
	//Xuất ra m
	System.out.println(km + " Km = " + m + " m");
}
}
