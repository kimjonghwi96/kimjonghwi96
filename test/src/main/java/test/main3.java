package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import test.Solution;

public class main3 {

	public static void main(String[] args) {

//		solution 실험
//		Solution sol1 = new Solution();
//		sol1.solution("1100111");

		String s1 = "101010";
		int[] answer = new int[2];
		String s1_minus0 = "";
		int s2 = 0;
		int cntI = 0;
		int cnt0 = 0;

		while (s1.equals("1") != true) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.substring(i, i + 1).equals("1")) {
					s1_minus0 = s1_minus0 + 1;
				}
			}
			cnt0 = cnt0 + s1.length() - s1_minus0.length();
			s2 = s1_minus0.length();
			s1 = "";
			while (s2 > 1) {
				if (s2 / 2 >= 1) {
					s1 = s1 + 1;
				} else {
					s1 = s1 + 0;
				}
				s2 = s2 - s2 / 2;
//				System.out.println(s2);
			}

			cntI = cntI + 1;
		}
		System.out.println(s1);
		answer[0] = cntI;
		answer[1] = cnt0;
		System.out.println(answer);

	}
}
