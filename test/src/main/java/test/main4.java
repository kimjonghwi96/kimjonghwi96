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
//		멀리뛰기
		int n = 10;
		int N = n / 2;
		long sum = 0;
		for (int i = 0; i <= N; i++) {
			long a1 = 1;
			for (int j = 1; j < i + 1
//					여기 고쳐야 됨!!!!!
//					&& j < n-i-j+1
					; j++) {
				a1 = a1 * (n - i - j + 1) / j;
			}
			System.out.println((n - i) + " C " + i + " = " + a1);
			sum = sum + a1;
		}
		sum = sum % 1234567;
		System.out.println(sum);

	}
}
