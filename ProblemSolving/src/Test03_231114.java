import java.util.Scanner;

public class Test03_231114 {

	public static void main(String[] args) {
		// 컴퓨터와 하는 가위바위보 게임 만들기
		
				Scanner scanner = new Scanner(System.in);
				double randomValue = Math.random();
				System.out.print("몇 판? ->");
				int a = scanner.nextInt();
				int meScore = 0;
				int computerScore = 0;
				
				for(int i=1; i<=a; i++) {
					int computer = (int)(randomValue * 3);
					System.out.println("0: 주먹 1: 가위 2: 보 3: 종료");
					int me = scanner.nextInt();
					System.out.println("computer : " + computer + ", me : " + me);
				if(computer==0) { // 주먹일 때
					if(me==0) {
						System.out.println("비겼습니다");
						meScore+=1;
						computerScore+=1;
					}else if(me==1) {
						System.out.println("computer 승!");
						computerScore+=1;
					}else if(me==2) {
						System.out.println("me 승!");
						meScore+=1;
					}else if(me ==3) {
						System.out.println("종료하겠습니다.");
						System.out.println("me : " + meScore + ", computer : " + computerScore);
						break;
					}else {
						System.out.println("0: 주먹 1: 가위 2: 보 3: 종료");
					}
				}else if(computer==1) { // 가위일 때
					if(me==0) {
						System.out.println("me 승!");
						meScore+=1;
					}else if(me==1) {
						System.out.println("비겼습니다.");
						computerScore+=1;
					}else if(me==2) {
						System.out.println("computer 승!");
						computerScore+=1;
					}else if(me ==3) {
						System.out.println("종료하겠습니다.");
						System.out.println("me : " + meScore + ", computer : " + computerScore);
						break;
					}else {
						System.out.println("0: 주먹 1: 가위 2: 보 3: 종료");
					}
				}else if(computer==2) { // 보일때
					if(me==0) {
						System.out.println("computer 승!");
						computerScore+=1;
					}else if(me==1) {
						System.out.println("me 승!");
						meScore+=1;
					}else if(me==2) {
						System.out.println("비겼습니다.");
						meScore+=1;
						computerScore+=1;
					}else if(me ==3) {
						System.out.println("종료하겠습니다.");
						System.out.println("me : " + meScore + ", computer : " + computerScore);
						break;
					}else {
						System.out.println("0: 주먹 1: 가위 2: 보 3: 종료");
					}
				}else {
					System.out.println("종료");
				}
				System.out.println("me : " + meScore + ", computer : " + computerScore);
				
				}
	}

}
