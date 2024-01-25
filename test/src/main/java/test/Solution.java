package test;

import java.util.Arrays;

class Solution {
//    public int solution(int[] numbers, int n) {
//        int answer = 0;
//        for(int i = 0;i<numbers.length;i++){
//        	answer = answer+numbers[i];
//            if(answer > n){
//                return answer;
//            }
//        }
//        return answer;
//    }
	
//    public int[] solution(int[] num_list, int n) {
//    	int[] answer = new int[num_list.length-n+1];
//        for(int i = 0;i<num_list.length-n+1;i++){
//            answer[i]=num_list[n+i-1];
//        }
//        return answer;
//    }
//    public int solution(String my_string, String is_suffix) {
//        int answer = 0;
//        for(int i=0;i<my_string.length()-is_suffix.length();i++){
//            if(is_suffix.equals(my_string.substring(i))){
//                answer=1;
//            }
//        }
//        return answer;
//    }
    
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        for(int i = 0;i<num_list.length-5;i++){
            answer[i]=num_list[i];
        }
//        Arrays.
        return answer;
    }
	
//    public int solution(int[][] board, int k) {
//        int answer = 0;
//        for(int i=0;i<=k;i++){
//            for(int j=0;j<=k-i;j++){
//                answer= answer+board[i][j];
//            }
//        }
//        return answer;
//    }
}
