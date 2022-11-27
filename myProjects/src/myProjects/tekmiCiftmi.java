package myProjects;

import java.util.Scanner;

public class tekmiCiftmi {

	public static void main(String[] args) {
		int N =18;
		if (N % 2 == 1 || (N % 2 == 0 && (N >= 6 && N <= 20))) {
			System.out.println("Weird");
		} else if (N % 2 == 0 && (N >= 2 && N <= 5 || N > 20)) {
			System.out.println("Not Weird");
		}
	}

}
