package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import test.Solution;


public class main {

	public static void main(String[] args) {
////		구구단
//		for(int i = 1; i<10 ;i++) {
//			for(int j = 1; j<10 ; j++) {
//				if(j==1) {
//					System.out.println(i + "단");
//				}
//				System.out.println(i + " x " + j +" = " + i*j);
//			}
//		}
//
////		1~10000 중 특정 숫자 갯수
//		int[] numList = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//		for (int k = 0; k < 10; k++) {
//			char numChar = Integer.toString(k).toCharArray()[0];
//			for (int i = 1; i <= 10000; i++) {
//				String num = Integer.toString(i);
//				for (int j = 0; j < num.length(); j++) {
//					if (num.charAt(j) == numChar) {
//						numList[k] = numList[k] + 1;
//					}
//				}
//			}
//			System.out.println(numChar + " 갯수 : " + numList[k]);
//		}
//		
////		피보나치 수열 출력
//		ArrayList list1 = new ArrayList();
//		list1.add(0,1);
//		list1.add(1,2);
//		
//		//i+2개의 항, 10000미만
//		for(int i=0;true;i++) {
//			int c = (int)list1.get(i) + (int)list1.get(i+1);
//			if(c>10000) {
//				break;
//			}
//			list1.add(c);
//		}
//		System.out.println("피보나치(초항 "+ list1.get(0) + ", "+ list1.get(1) + ") : " + list1);
//		
////		3의배수 && 5의배수
//		int a = 0;
//		for(int i=1;i<=1000;i++) {
//			if(i%3==0||i%5==0) {
////				System.out.println(i);
//				a = a + i;
//			}
//		}
//		System.out.println("3 또는 5의 배수의 합산 : "+a);
//		
////		소수
//		List<Integer> decimal_List = new ArrayList<>();
//		for(int i=1;i<100;i++) {
//			int maxj = i;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					maxj = maxj-1;
//				}
//			}
//			if(maxj == i-2) {
//				decimal_List.add(i);
//			}
//		}
//		System.out.println("소수 : " + decimal_List);
//		
////		문자열 뒤집기
//		String str = "abcd";
//		int len = str.length();
//		char[] charlist = str.toCharArray();
//		ArrayList<Character> new_charlist = new ArrayList<>();
//		for (int i = len -1; i>=0;i--) {
//			new_charlist.add(charlist[i]);
//		}
//		System.out.println("문자열 뒤집기 : " + new_charlist);
//		
////		입력받기
//		System.out.println("숫자 2개를 입력하시오");
//		Scanner sc = new Scanner(System.in);
//		int sc1 = sc.nextInt();
//		int sc2 = sc.nextInt();
//		int sum_sc =sc1+sc2;
//		System.out.println("합: " + sum_sc);
		
		
		
//		solution 실험
		Solution sol1 = new Solution();
		sol1.solution("11111");

	}
}

