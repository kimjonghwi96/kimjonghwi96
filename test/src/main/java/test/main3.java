package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import test.Solution;

public class main3 {

	public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////////////////
//		이진변환

//		String s1 = "11011001101";
//		int[] answer = new int[2];
//		int cnt0 = 0;
//		int cntI = 0;
//
//		while (s1.equals("1") != true) {
//			String s1_minus0 = "";
//			int s2 = 0;
//			String s3 = "";
//
//			for (int i = 0; i < s1.length(); i++) {
//				if (s1.substring(i, i + 1).equals("1")) {
//					s1_minus0 = s1_minus0 + 1;
//				}
//			}
//			System.out.println("s1 : " + s1);
//			System.out.println("s1_minus0 : " + s1_minus0);
//			s2 = s1_minus0.length();
//			System.out.println("s2 : " + s2);
//			cnt0 = cnt0 + s1.length() - s1_minus0.length();
//			System.out.println("cnt0 : " + cnt0);
//
//			System.out.println("===========================");
//
//			while (true) {
//				System.out.println("s2 : " + s2);
//				System.out.println("s3 : " + s3);
//				if (s2 == 1) {
//					s3 = 1 + s3;
//					break;
//				} else if (s2 % 2 == 1) {
//					s3 = "1" + s3;
//				} else {
//					s3 = "0" + s3;
//				}
//				s2 = s2 / 2;
//			}
//			System.out.println("s3결과 : " + s3);
//			s1 = s3;
//			System.out.println("s1재설정 : " + s1);
//			cntI = cntI+1;
//		}
//		answer[0] = cntI;
//		answer[1] = cnt0;
//		System.out.println("답 : " + answer[0] + ", " + answer[1]);

/////////////////////////////////////////////////////////////////////////////////
//		연속된 숫자를 더해서 int1을 만들수 있는 경우의 수
//		int int1 = 1;
//		int cnt = 0;
//		for (int i=1;i<=int1/2;i++) {
//			int sum=0;
//			for (int j=0;j<int1;j++) {
//				int i2=i+j;
//				sum=sum+i2;
//				if(sum>int1) {
//					break;
//				} else if(sum==int1) {
//					cnt = cnt+1;
//					System.out.println("i : " + i);
//					break;
//				}
//			}
//		}
//		cnt = cnt+1;
//		System.out.println(cnt);
////////////////////////////////////////////////////////////////////
//		큰수(이진법으로 1갯수 같은) 찾기 효율실패
//		int int1 = 78;
//		int answer = 0;
//		int length1 = Integer.toBinaryString(int1).replace("0","").length();
//		System.out.println(length1);
//		for(int i=int1+1;i<=2*int1;i++) {
//			int length2 = Integer.toBinaryString(i).replace("0","").length();
//			if(length2 == length1) {
//				answer=i;
//				break;
//			}
//		}
//		System.out.println(answer);
////////////////////////////
////		큰수 찾기
//		int int1=15;
//		System.out.println("int1 : " + int1);
//		String str1="0"+Integer.toBinaryString(int1);
//		int m1 =str1.replace("0", "").length();
//		String str2="";
//		String str3="";
//		int answer = 0;
//		int i1=0;
//		System.out.println("str1 : " + str1);
//		System.out.println("str1.length() : "+str1.length());
//		System.out.println("1갯수 : " + m1);
//		for(int i=0;i<str1.length();i++) {
//			if(str1.substring(str1.length()-i-2,str1.length()-i).equals("01")) {
//				i1=i;
//				System.out.println("str1.length()-i1 : " + (str1.length()-i1));
//				break;
//			}
//		}
//		str2=str1.substring(0,str1.length()-i1-2) + "10";
//		System.out.println("str2 : " + str2);
//		m1=m1-str2.replace("0", "").length();
//		for(int i=0;i<i1;i++) {
//			if(m1>0) {
//				str3 = str3+1;
//				m1=m1-1;
//			} else {
//				str3 = 0+str3;
//			}
//		}
//		System.out.println("str3 : " + str3);
//		System.out.println("answer(2) : " + str2 + str3);
//		answer= Integer.parseInt(str2+str3,2);
//		System.out.println("answer : " + answer);
//////////////////////////////////
//		answer = Integer.parseInt(str2, 2);
//
////		System.out.println("len1 : " + len1 + ", len2 : " + len2);
//		System.out.println(int1);
//		System.out.println("int1 : " + Integer.toBinaryString(int1));
//		System.out.println("str2 : " + Integer.parseInt(str2));
//		
//		System.out.println("answer : " + answer);
///////////////////////////////////////

////		System.out.println("//////////////////////////////////////////");
//		
//		int aaa1 = 1501111121;
//		System.out.println("입력값 : " + aaa1);
//		System.out.println("입력값2 : " + Integer.toBinaryString(aaa1));
//		int p1=1;
//		int answer = 0;
//		for(int i=0;i<Integer.toBinaryString(aaa1).length();i++) {
//			p1=p1*2;
//		}
////		System.out.println(p1);
//		for(int i=aaa1+1;i<=aaa1+p1/2;i++) {
//			if(Integer.toBinaryString(i).replace("0", "").length()==Integer.toBinaryString(aaa1).replace("0", "").length()) {
//				answer=i;
//				break;
//			}
//		}
//		
//		System.out.println("answer : " + answer);
//		System.out.println("answer2 : " + Integer.toBinaryString(answer));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String s = "baacbaa";
		int answer = 1;
		int cnt = 0;
		String s2 = s;
		while (!s.equals("")) {
			char[] charArray = s.toCharArray();
			for (int i = 0; i < s.length() - 1; i++) {
				if (charArray[i] == charArray[i + 1]) {
					charArray[i] = ' ';
					charArray[i + 1] = ' ';
					break;
				}
			}
//			s="";
//			for (int i = 0; i < charArray.length; i++) {
//				if(charArray[i] != ' ') {
//					s = s + charArray[i];
//				}
//			}
			s=String.valueOf(charArray).replace(" ", "");
			cnt = cnt + 1;
			if (s2.length() == s.length()) {
				answer = 0;
				break;
			}
			s2 = s;
		}

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("s : " + s);
		System.out.println("cnt : " + cnt);
		System.out.println("answer : " + answer);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
