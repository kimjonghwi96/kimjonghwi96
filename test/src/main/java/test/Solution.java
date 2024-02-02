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
    
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length-5];
//        Arrays.sort(num_list);
//        for(int i = 0;i<num_list.length-5;i++){
//            answer[i]=num_list[i];
//        }
////        Arrays.
//        return answer;
//    }
	
//    public int solution(int[][] board, int k) {
//        int answer = 0;
//        for(int i=0;i<=k;i++){
//            for(int j=0;j<=k-i;j++){
//                answer= answer+board[i][j];
//            }
//        }
//        return answer;
//    }
    
    
    public int[] solution(String s1) {
        int[] answer = new int[2];
        String s1_minus0 = "";
        int s2=0;
        int cntI = 0;
        int cnt0 = 0;
        
        while(s1.equals("1") != true){
            for(int i=0;i<s1.length();i++){
                if(s1.substring(i,i+1).equals("1")){
                    s1_minus0 = s1_minus0 + 1;
                }
            }
            cnt0 = cnt0 + s1.length()-s1_minus0.length();
            s2 = s1_minus0.length();
            s1="";
            while(s2>0){
                if(s2/2>=1){
                    s1=s1+1;
                } else{
                    s1=s1+0;
                }
                s2=s2-s2/2;
            }
            
            cntI = cntI +1;            
        }
        System.out.println(s1);
        answer[0]=cntI;
        answer[1]=cnt0;
        return answer;
    }
    
    
}
