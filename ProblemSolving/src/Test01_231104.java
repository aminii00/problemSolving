import java.util.Scanner;

public class Test01_231104 {

	public static void main(String[] args) {

		/*
		 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
		 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요. 예를들어 s가 "1 2 3 4"라면 "1 4"를
		 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String str = s.replace(" ", ""); // 공백 제거  
		String[] S = str.split("");      //""기준으로 잘라서 배열에 저장
		System.out.println(S[0]);
		for(int i =0; i<S.length; i++) {
			Integer.parseInt(S[i]);
		}
		//최솟값
		String min = S[0];
		for(int i =0; i<S.length-1; i++) {
		if(Integer.parseInt(min)>Integer.parseInt(S[i+1])) {
			min = S[i+1];
		   }
		}
		//최댓값
		String max = S[0];
		for(int i =0; i<S.length-1; i++) {
		if(Integer.parseInt(max)<Integer.parseInt(S[i+1])) {
			max = S[i+1];
		   }
		}
		
		System.out.println("최댓값 : " +max +" 최소값: " +min);
	}

}
