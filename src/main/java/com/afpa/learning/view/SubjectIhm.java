package com.afpa.learning.view;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SubjectIhm {

	public static final SubjectIhm IHM_INS = new SubjectIhm();
	private Scanner scanner;
	
	private SubjectIhm() {
		this.scanner = new Scanner(System.in);
	}
	
	public String stringReader() {
		System.out.println("   > ");
		String input = this.scanner.next();
		System.out.println();
		return input;
	}
	
	public int intReader() {
		System.out.println("   > ");
		int input = -1;
		try {
			input = this.scanner.nextInt();
		}catch (NumberFormatException | InputMismatchException e) {
			this.scanner.nextLine();
		}
		System.out.println();
		return input;
	}
	
	public void display(String pMessage) {
		System.out.print(pMessage + "\n");
	}
}
