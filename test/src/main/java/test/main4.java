package test;

import java.util.Arrays;

public class main4 {

	public static void main(String[] args) {

//		int a = 120;
//		System.out.println(Math.sqrt(a));

//		String[] words = { "aba", "aba", "bba" };
//		int n = 3;
//		int[] answer = { 0, 0 };
//		for (int i = 1; i < words.length; i++) {
//			if (!words[i].substring(0, 1).equals(words[i - 1].substring(words[i - 1].length() - 1))) {
//				answer[0] = i % n + 1;
//				answer[1] = i / n + 1;
//				break;
//			}
//			for (int j = 0; j < i; j++) {
//				if (words[i].equals(words[j])) {
//					answer[0] = i % n + 1;
//					answer[1] = i / n + 1;
//					break;
//				}
//			}
//		}
//
//		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//		System.out.println(answer[0] + "  " + answer[1]);
///////////////////////////////////////////////////////////////////
//		String a =Integer.toBinaryString(5000);
//		char[] b =a.toCharArray();
//		int c=0;
//		for(int i=0;i<b.length;i++) {
//			if(b[i]=='1') {
//				c++;
//			}
//		}
//		System.out.println(c);
///////////////////////////////////////////////////////////////////////////
		// 보트 greedy 탐욕
//		int[] people = { 50, 50, 70, 80 };
//		int limit = 100;
//		int answer = 0;
//		Arrays.sort(people);
//		int left = 0;
//		int right = people.length - 1;
//
//		while (left <= right) {
//			if (people[left] + people[right] <= limit) {
//				right--;
//				left++;
//				answer++;
//			} else {
//				right--;
//				answer++;
//			}
//		}
//
////		for (int i = people.length-1; i >= 0; i--) {
////			if (people[i] != 0) {
////				if ((limit - people[i]) >= 40) {
////					for (int j = 0; j < people.length-1; j++) {
////						if (people[i] + people[j] <= limit && people[j] != 0) {
////							people[j] = 0;
////							break;
////						}
////					}
////				}
////				people[i] = 0;
////				answer++;
////			}
////		}
//
//		System.out.println(answer);

////////////////////////////////////////////
//		int[] arr = { 2, 3, 4, 5 };
//		Arrays.sort(arr);
//		int answer=arr[arr.length-1];
//
//		int i1=0;
//		while(i1<arr.length-1) {
//			if (answer % arr[i1] != 0) {
//				answer = answer + arr[arr.length - 1];
//				i1=0;
//			} else {
//				i1++;
//			}
//		}
//		System.out.println(answer);
/////////////////////////////////////////////////////
//		int a = 3;
//		int b = 6;
//		System.out.println(Integer.toBinaryString(a^b));
////		System.out.println(3^6);
///////////////////////////////////////////////////////
//		멀리뛰기 : 조합으로 풀다가 피보나치로 전환
//		int n = 4;
//		int N = n / 2;
//		long sum = 0;
//		for (int i = 0; i <= N; i++) {
//			long a1 = 1;
//			for (int j = 1; j <= i; j++) {
//				if(j>(n-2*i)) {
//					break;
//				}
//				a1 = a1  * (n - i - j + 1) / j;
//			}
//			sum = (sum % 1234567 + a1 % 1234567) % 1234567;
//			System.out.println((n - i) + " C " + i + " = " + a1);
//		}
//		System.out.println(sum);
//////////////////
//		int n = 5;
//		long answer = 1;
//		int[] list = { 1, 2, 3 };
//		if (n <= 3) {
//			answer = list[n - 1];
//		} else {
//			for (int i = 3; i < n; i++) {
//				list[0] = list[1] % 1234567;
//				list[1] = list[2] % 1234567;
//				list[2] = list[0] + list[1];
//			}
//			answer = list[2] % 1234567;
//		}
//		System.out.println(answer);
/////////////////////////////////////////////////////////////////////////////////
//		귤 고르기
//		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
//		int k = 6;
//		int[][] a = new int[tangerine.length][2];
//		int answer = 0;
//		Arrays.sort(tangerine);
//
//		a[0][0] = tangerine[0];
//
//		for (int i = 0; i < tangerine.length-1; i++) {
//			for (int j = 0; j < tangerine.length; j++) {
//				if(a[i][0] ==0) {
//					break;
//				}
//				if (tangerine[j] > a[i][0]) {
//					a[i+1][0] = tangerine[j];
//					break;
//				}
//			}
//		}
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("[" + a[i][0] + ", " + a[i][1] + "]");
//		}
////		for (int i = 0; i < a.length; i++) {
////			System.out.print(tangerine[i] + ", ");
////		}
//
//		for (int i = 0; i < tangerine.length; i++) {
//			for (int j = 0; j < tangerine.length; j++) {
//				if (a[i][0] == tangerine[j]) {
//					a[i][1]++;
//					tangerine[j] = -1;
//				}
//			}
//		}
//		System.out.println("\n-----------------------------------------------------");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("[" + a[i][0] + ", " + a[i][1] + "]");
//		}
//		
//		
//		int[] b = new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[i][1];
//		}
//		Arrays.sort(b);
//		System.out.println();
//		for (int i = 0; i < b.length; i++) {
//		System.out.print(b[i] + ", ");
//		}
//		
//		for(int i= b.length-1;i>=0;i--) {
//			if(k>0) {
//				k=k-b[i];
//				answer++;
//			}
//		}
//		System.out.println();
//		System.out.println("answer : " + answer);

//////////////////
//		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
//		int k = 6;
//		int[][] a = new int[tangerine.length][2];
//		int answer = 0;
//		Arrays.sort(tangerine);
//
//		a[0][0] = tangerine[0];
//
//		for (int i = 0; i < tangerine.length - 1; i++) {
//			for (int j = 0; j < tangerine.length; j++) {
//				if (a[i][0] == 0) {
//					break;
//				}
//				if (tangerine[j] > a[i][0]) {
//					a[i + 1][0] = tangerine[j];
//					break;
//				}
//			}
//		}
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("[" + a[i][0] + ", " + a[i][1] + "]");
//		}
////		for (int i = 0; i < a.length; i++) {
////			System.out.print(tangerine[i] + ", ");
////		}
//
//		for (int i = 0; i < tangerine.length; i++) {
//			for (int j = 0; j < tangerine.length; j++) {
//				if (a[i][0] == tangerine[j]) {
//					a[i][1]++;
//					tangerine[j] = -1;
//				}
//			}
//		}
//		System.out.println("\n-----------------------------------------------------");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("[" + a[i][0] + ", " + a[i][1] + "]");
//		}
//
//		int[] b = new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[i][1];
//		}
//		Arrays.sort(b);
//		System.out.println();
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + ", ");
//		}
//
//		for (int i = b.length - 1; i >= 0; i--) {
//			if (k > 0) {
//				k = k - b[i];
//				answer++;
//			}
//		}
//		System.out.println();
//		System.out.println("answer : " + answer);
		
//////////////////
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		int k = 6;
		int[] a1 = new int[tangerine.length];
		int[] a2 = new int[tangerine.length];
		int answer = 0;
		Arrays.sort(tangerine);
		
		a1[0] = tangerine[0];
		
		for (int i = 0; i < tangerine.length - 1; i++) {
			for (int j = 0; j < tangerine.length; j++) {
				if (a1[i] == 0) {
					break;
				}
				if (tangerine[j] > a1[i]) {
					a1[i + 1] = tangerine[j];
					break;
				}
				if (a1[i] == tangerine[j]) {
					a2[i]++;
					tangerine[j] = -1;
				}
			}
		}
		if (a1[tangerine.length - 1] == tangerine[tangerine.length - 1]) {
			a2[tangerine.length - 1]++;
			tangerine[tangerine.length - 1] = -1;
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.print("[" + a1[i] + ", " + a2[i] + "]");
		}
		System.out.println("\n-----------------------------------------------------");
		for (int i = 0; i < a1.length; i++) {
			System.out.print("[" + a1[i] + ", " + a2[i] + "]");
		}
		
//		int[] b = new int[a2.length];
//		for (int i = 0; i < a2.length; i++) {
//			b[i] = a2[i];
//		}
		Arrays.sort(a2);
		System.out.println();
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + ", ");
		}
		
		for (int i = a2.length - 1; i >= 0; i--) {
			if (k > 0) {
				k = k - a2[i];
				answer++;
			}
		}
		System.out.println();
		System.out.println("answer : " + answer);

	}
}
