package hien_thi_cac_loai_hinh;

import java.util.Scanner;



public class hienthicacloaihinh {

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Print the rectangle");
		System.out.println("2. Print the square triangle");
		System.out.println("3. Print isosceles triangle");
		System.out.println("4. Exit");
		System.out.println("Enter your choice");
		choice = input.nextInt();
		while(choice!=4) {
			switch(choice) {
			case 1:
				int m1,n1;
				Scanner scanner = new Scanner(System.in);
				System.out.println("nhap vao chieu rong hinh chu nhat");
				m1 = scanner.nextInt();
				System.out.println("nhap vao chieu cao hinh chu nhat");
				n1 = scanner.nextInt();
				
				for(int i = 0; i < m1 ; i++) {
					for(int j = 0; j< n1; j++) {
						System.out.print(" * ");
					}
					System.out.println();	
					
				}
			break;
			case 2:
				for(int i = 0 ; i <= 5; i++ ){
					for(int j = 0; j<i; j ++) {
						System.out.print(" * ");
					}
					System.out.println();	
					
				}
			break;
			case 3:
				for(int i = 7 ; i >= 1; i-- ){
					for(int j = 1; j<i; j ++) {
						System.out.print(" * ");
					}
					System.out.println();
				}
			case 4:
				System.exit(4);
			case 5:
				int h;
				Scanner scanner1 = new Scanner(System.in);
				h = scanner1.nextInt();
				int x, output;
				for(int i = 1; i <= h ; i++) {
					for(int j = 0 ; j<= 2*h; j++) {
						x = j-h;
						if(x < 0) {
							x *= -1;
						}
						output = i - x;
						
						if(output >0) {
							System.out.printf(" * ");
						}else {
							System.out.printf("   ");
						}
						
					}
					System.out.println();
				}
			break;
			
			default:
				System.out.println("No choice");
				
			}
		}
				
	}
}
