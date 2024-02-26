package test;

public class main4 {

	public static void main(String[] args) {

//		int a = 120;
//		System.out.println(Math.sqrt(a));

		String[] words = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		int n = 5;
		int[] answer = { 0, 0 };
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].substring(words[i].length() - 1).equals(words[i + 1].substring(0, 1))) {
			} else {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
			}
			for(int j = 0;j<i+1;j++) {
				if (words[i+1].equals(words[j])) {
					answer[0] = (i+1) % n + 1;
					answer[1] = i / n + 1;
				}
			}
		}

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println(answer[0] + "  " + answer[1]);
	}
}
