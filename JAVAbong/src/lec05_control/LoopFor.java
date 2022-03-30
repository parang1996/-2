package lec05_control;

public class LoopFor {

	public static void main(String[] args) {
		
		// 반복문 for
		int sum =0;
		for(int i = 0; i <=20; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
	
		
		// 실수 float, double 계산이 정확하지 않다.
		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 클릭하면 점이 생김
		 * ctrl + shift + B
		 * 토글 형식이라 더블클릭 혹은 단축키로 생성 삭제
		 * 코드를 한줄 한줄 실행해보면서 변수의 어떤 값이 담기는지 확인
		 * 상단 런 버튼 왼쪽에 벌레 아이콘 클릭하면 실행
		 * 디버깅 모드에 적합한 화면 스타일 전환 메시지 창 -> OK -> 실행
		 * 위에서부터 실행되다가 break 포인트(점)가 있는 지점에 멈춰서 대기
		 * 이후 상단 run - step-over [단축키 F6] 한줄 한줄 실행
		 * 종료 terminate [단축키 ctrl + F2]
		 * 원래화면 복귀 - 우측 상단 perspective 버튼에서 java 선택
		 */
		
		// 구구단 2단
		

		
		String star = "";
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j <= i; j++) {
		        star += '*';
		    }
		    star += '\n';
		}
		System.out.println(star);
		
		
		for(int num =1; num <= 100; num++) {
			if((num%3)!=0) {
				continue;
			}System.out.println(num);
		}
		
		star = "*****";
		for(int i=0; i < 5; i++) {
			System.out.println(star);
			star = star.replaceFirst("\\*", "");
			// *, ?, + 를 문자로 써야 에러가 안난다 
			// 문자로 쓰려면 특수기호 앞에 \\ 붙인다
			// regex 정규표현식(Regular Expression)을 의미
			// 회원가입 할 때 이름에 숫자 넣었는지 확인하고 경고
			// 연락처에 숫자만 넣었는지 확인하고 경고
			// 아이디에 영어랑 숫자만 넣었는지 확인
			// 비밀번호 패턴 (영어 대소문자 숫자 특수기호 각각 1개 이상)
		}
		
		System.out.println("\n ======== break 문");
		
		// 1가 0부터 10까지 증가하는 for문에서
		// 1가 5보다 커지게 되면 종료
		
		for(int i= 0; i <=10; i++) {
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
		// 1부터 n까지 더한다고 했을 때, 100 이상이 되는 n
		int sumNum = 0;
		for(int i=1; i < 1000; i++) {
			sumNum += i;
			System.out.println(sumNum);
			if (sumNum >= 100) {
				System.out.println("100 이상이 되는 n은 " + i + "입니다");
				break;}
		}
		
		System.out.println("/n ===== continue문");
		
		// continue문
		for(int i = 1; i <=9; i++) {
			if(i < 5) {
				continue;
			}
			System.out.println("7 X " + i + " = " + (7*i));		
		}
		
		for(int i= 1; i <=9; i++) {
			if(i > 4) {
				System.out.println("7 X " + i + " = " + (7*i));
			}
		}
		
		
		System.out.println("\n ===== 구구단");
		
		//이중 for문
		for(int i=2; i <= 9; i++) {
			for(int j=1; j <=9; j++) {
				System.out.println(i+" X " + j + " = " + (i*j));
			} System.out.println();
		}
		
		System.out.println("\n ====== 트리");
		
		//트리 만들기
		
		star = "";
		for(int i = 0; i <5; i++) {
			String blank = "";
			for(int j=0; j < 5-i; j++){
				blank += " ";
			} 
			star += "*"; 
			System.out.println(blank + star);
		}		
		
		System.out.println("\n ====== 트리\n");
		
		// 크리스마스 트리 만들기
		star = "*";
		String blank = "";
		for(int i =0; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				blank += " ";
				System.out.print(blank);
			} 
			System.out.print(star);			
			star += "**";
		}
		System.out.println("\n ====== 트리\n");
		
		// 크리스마스 트리 거꾸로
		String empty = "";
		for(int i=0; i<10;i++) {
			for(int j=0; j<11-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
			empty += " ";
			System.out.print(empty);
		}
		
		// 제어문
		
		
		
		
	}	
}
