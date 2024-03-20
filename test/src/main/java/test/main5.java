package test;

import java.util.*;

public class main5 {

	public static void main(String[] args) {
		//연속 부분 수열 합의 개수
		int[] elements = {7,9,1,1,4};
		Arrays.sort(elements);
		
		Set<Integer> hashSet = new HashSet<>();
		
		
		for(int i=0;i<elements.length;i++) {
			int sum = 0;
			for(int j=0;j<elements.length;j++) {
				sum = sum + elements[(i+j) % elements.length];
				hashSet.add(sum);
			}
		}
		System.out.println(hashSet.size());
///////////////////////////////////////////////////////////////////////////

	}

}
