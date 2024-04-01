package test;

import java.util.*;

public class main5 {

	public static void main(String[] args) {
//		//연속 부분 수열 합의 개수
//		int[] elements = {7,9,1,1,4};
//		Arrays.sort(elements);
//		
//		Set<Integer> hashSet = new HashSet<>();
//		
//		
//		for(int i=0;i<elements.length;i++) {
//			int sum = 0;
//			for(int j=0;j<elements.length;j++) {
//				sum = sum + elements[(i+j) % elements.length];
//				hashSet.add(sum);
//			}
//		}
//		System.out.println(hashSet.size());
///////////////////////////////////////////////////////////////////////////

		String s = "[(){}]";
		char[] s2 = s.toCharArray();
		HashMap<Character, Character> hs = new HashMap<Character, Character>();
		hs.put('{', '}');
		hs.put('(', ')');
		hs.put('[', ']');

		System.out.println(s2);
		
		while (hs.isEmpty() == false) {
			for (int i = 0; i < s2.length - 1; i++) {
				if (hs.get(s2[i]) != null) {
					if (hs.get(s2[i]) == s2[i + 1]) {
						System.out.println(s2[i]);
						hs.remove(s2[i]);
						s2[i] = 0;
						s2[i + 1] = 0;
					}
				}
			}
		}
		for (int i = 0; i < s2.length; i++) {
			System.out.println("s2 : " + s2[i]);
		}
		System.out.println("hs : " + hs);

	}

}
