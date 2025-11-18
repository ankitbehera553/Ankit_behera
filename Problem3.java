package com.ankit;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int num = 1;
		if(a % 2 == 0) {
			a -= 1;
		}
		for(int i = 1; i <= a; i++) {
			System.out.print(num + ",");
			num+=2;
		}
		sc.close();
	}

}