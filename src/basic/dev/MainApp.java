package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		if (n == 1 || n == 3 || n == 5|| n == 7 || n == 8 || n == 10 || n == 12) {
			System.out.println("Thang " + n + " " + "co 31 ngay");
		}else if (n == 4 || n == 6 || n == 9 || n == 11) {
			System.out.println("Thang " + n + " " + "co 30 ngay");
		}else if (n == 2) {
			System.out.println("Thang " + n + " " + "co 28 ngay");
		}else {
			System.out.println("Thang nhap vao khong dung! Vui long nhap lai");
		}
	}

}
