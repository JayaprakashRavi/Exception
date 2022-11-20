package org.Test;

public class Sample11 {
	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 50;

			int value = a / b;
			try {
				System.out.println("value");

				int c[] = { 2 };
				c[5] = 5;
			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("index");
			}
		}

		catch (ArithmeticException e) {
			System.out.println("correct");
		} //finally {
			//System.out.println("bye");

		}
	}

