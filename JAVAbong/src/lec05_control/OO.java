package lec05_control;

public class OO {

	public static void main(String[] args) {
		// 1부터 10까지 중 홀수만 출력
		// 10번 출력
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 실행횟수를 줄일 수 있다 -> 실행속도 증가
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		
		String star ="";
		for(int i=1; i<=5; i++) {
			star += i;
			System.out.println(star);
		}
		
		// 국수공장에서 면을 20cm 뽑고 있는데
		// 5cm마다 잘라주는 로직
		// if문
		for(int i=0; i < 20; i++) {
			System.out.println("||||||||");
			if((i == 4) || (i == 9) || (i == 14)) {
				System.out.println("--------");
			}
		}
		// 라면공장에서 면을 30cm 뽑고 있는데
		// 6cm마다 잘라주는 로직
		// 나머지 연산자
		
		/*
		 * for(int i =1; i <= 30; i++) {
			if(i % 2 ==1) {
				System.out.println("////////");
			} else {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			if(i % 6 ==0) {
				System.out.println("-------");
			}
			try {
				Thread.sleep(300); // 현재 프로그램을 실행중인 스레드를 괄호안 시간(단위:ms(/1000))만큼 잠깐 재웠다가 깨워줌
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		*/
		
		// 0시를 기준으로 매 시간마다 시간을 콘솔에 출력한다 100시간
		
		for(int i = 0; i <100; i++) {
			System.out.println(i%24);
		}
		
		// 시간뿐만 아니라 일자도 나타나게 해보아요
		
		int currentDay = 18;
		int currentTime = 3;
		// 100시간후, 며칠, 몇시가 될까?
		for(int i = 0; i < 100; i++) { // 이 for문은 {}내에 명령문을 100번 실행.
			int day = currentDay + (currentTime/24);
			int time = currentTime%24;
			System.out.println(day+ "일 "+ time + "시");
			currentTime++;
		}
		
		// 유니코드에서 한글이 시작('가' = 44032) 부터 이후 10개 출력해보아요
		
		char charNum = 44032;
		for(int i=0; i < 10; i++) {
			System.out.println((i+1)+"."+charNum);
			charNum++;
		}
		
		// 거꾸로 for문
		// 10부터 1까지 출력
		int hiNum =10;
		for(int i =0; i < 10; i++) {
			System.out.println(hiNum);
			hiNum--;
		}
		
		for(int i=10; i >0; i--) {
			System.out.println(i);
		}
		
		// for문으로 String 가지고 놀기
		// 숫자 문자열의 각 자리수를 더해서 출력
		
		String example = "3928459324";
		int result = 0;
		for(int i=0; i < example.length(); i++) {
			result += Integer.parseInt(example.substring(i,i+1));
		} System.out.println("각 자리수를 더한결과는 " + result);
		
		
		System.out.println("\n");
		
		// 슈가 몇개 일까요
		int countSu = 0;
		String sususu = "슈슈슛ㅅ슛슈슈,.,! 슈슈슉";
		for(int i = 0; i < sususu.length(); i++) {
			String strNum = sususu.substring(i, i+1);
			if(strNum.equals("슈")){
				countSu += 1;
			}	
		}	System.out.println("슈의 갯수는 " + countSu);
		
		
		System.out.println("\n");
		
		int countSuu = 0;
		for(int i = 0; i < sususu.length()-1; i++) {
			String strNum = sususu.substring(i, i+1);
			if(strNum.equals("슈")){
				countSuu =+ 1;
				System.err.print(strNum);
			} else {
				System.out.print(strNum);
			}
		}
		System.out.println();
		System.out.println("슈의 갯수는 " + countSuu);
		
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
	}
}
