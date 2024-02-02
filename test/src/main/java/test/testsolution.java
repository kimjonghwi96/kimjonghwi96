package test;

public class testsolution {
	public static String solution(String s) {
		String answer = "";
//		String[] s2 = s.split(" ");
//		for (int i = 0; i < s2.length; i++) {
//			if (s2[i].equals("")) {
//			}
//			else if (s2[i].substring(0, 1).equals(s2[i].substring(0, 1).toUpperCase())) {
//				answer = answer + s2[i];
//			} else {
//				answer = answer + s2[i].substring(0, 1).toUpperCase() + s2[i].substring(1).toLowerCase();
//			}
//			if (i == s2.length - 1) {
//				break;
//			} else {
//				answer = answer + " ";
//			}
//		}
		answer = answer + s.substring(0,1).toUpperCase();
		for(int i=0;i<s.length()-1;i++) {
			if(s.substring(i,i+1) == " " ||s.substring(i,i+1).equals(" ")) {
				answer = answer + s.substring(i+1,i+2).toUpperCase();
			} else {
				answer =answer + s.substring(i+1,i+2).toLowerCase();
			}
		}
		return answer;
		
		
		
		
	}
}
