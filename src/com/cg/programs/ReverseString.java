package com.cg.programs;

public class ReverseString {
	public static void main(String[] args) {
		String str = "komal";
		char ch[] = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);

		}
	}

}
