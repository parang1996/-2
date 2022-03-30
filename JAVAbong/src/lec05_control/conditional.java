package lec05_control;

public class conditional {
	public static void main(String[] args) {
		
		// 조건문 if
		
		int intVar = 3;
		if(intVar > 0) {
			System.out.println("0보다 커요");
		}
		
		if(intVar < 0) {
			System.out.println("0보다 작아요");
		} else {
			System.out.println("0보다 커요");
		}
		
		// 웹 브라우저에서 사용자가 로그인을 하면 세션 스토리지에 정보가 저장
		// 이 정보를 이용해서 로그인 된 화면 혹은 로그인되지 않은 화면을 보여줍니다.
		// jsp 때는 세션에서 정보 가져옴
		
//		String loginId = "aaa";
//		if(loginId != null) {
//			System.out.println("로그인 상태의 화면");
//		} else {
//			System.out.println("로그인 화면으로 이동");
//		}
		
		// 전원버튼 로직
		
		boolean isPowerOn = false;
		
		if(isPowerOn) {
			System.out.println("티비끄세요");
			isPowerOn = false;
		} else {
			System.out.println("티비키세요");
			isPowerOn = true;
		}
		// boolean의 true/false를 스위치의 on/off 처럼 사용 -> 토글 혹은 플래그
		if(isPowerOn) {
			System.out.println("티비끄세요");
			isPowerOn = !isPowerOn;
		} else {
			System.out.println("티비키세요");
			isPowerOn = !isPowerOn;
		}
		
		// 주민번호 뒷자리의 첫번째 숫자로 성별 찾기
		
		String hisIdBack = "136421";
		int idNumFirst = Integer.parseInt(hisIdBack.substring(0,1));
		
		if(idNumFirst % 2 == 0) {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}
		
		// 이중 삼항 연산자
		
		int score = 85;
		String grade = "";
		
		if(score > 90) {
			grade = "A";
		} else if(score > 80) {
			grade = "B";
		} else {
			grade = "c";
		}	
		System.out.println(grade + "등급");
		// 순서 조심해야하는 경우 - 첫번째를 만족하기 때문에 다음 조건으로 안 넘어감
		score = 92;
		if(score > 80) {
			grade = "B";
		} else if (score > 90) {
			grade = "A";
		} else {
			grade = "C";
		}
		System.out.println(grade + "등급");
		
		// 조건을 명확히 
		if(score > 80 && score <= 90) {
			grade = "B";
		} else if(score > 90) {
			grade = "A";
		} else {
			grade = "C";
		}
		System.out.println(grade + "등급");
		
		// 사용자가 회원가입 할 때, 입력정보 전부 확인한 후 가입버튼 활성화
		
		String name = "";
		String phone = "";
		String age = "";
		
		//level 1
		if(name.length() > 0) {
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					System.out.println("회원가입 버튼 활성화");
				} else {
					System.out.println("불가");
				}
			} else {
				System.out.println("불가");
			}
		} else {
			System.out.println("불가");
		}
		
		// level2
		
		boolean isGood = false;
		
		if(name.length() > 0) {
			if(Integer.parseInt(age) >= 14) {
				if(phone.length() == 11 || phone.length() ==10) {
					isGood =true;
				}
			}
		}
		
		if(isGood) {
			System.out.println("버튼 활성화");
		} else {
			System.out.println("불가");
		}
		
		// level 3
		
		if((name.length() > 0) && 
			(phone.length() == 11 || phone.length() ==10) && 
			(Integer.parseInt(age) >= 14)) {
			System.out.println("버튼 활성화");
		} else {
			System.out.println("불가");
		}
		
		// switch 값을 매칭하는 경우
		
		int month = 3;
		
		if(month == 0) {
			System.out.println("열심히 배우고 있습니다");
		} else if(month == 1) {
			System.out.println("오라클 DB 마스터~");
		} else if(month == 2) {
			System.out.println("자바 마스터~");			
		} else if(month == 3) {
			System.out.println("자바스크립트 마스터");
		} else if(month == 4) {
			System.out.println("JSP 마스터~");
		} else if(month == 5) {
			System.out.println("팀 프로젝트 시작");
		} else {
			System.out.println("고생했어요");
		}
		
		// switch 문은 char, int, String 타입의 변수만 가능
		
		switch(month) {
		case 1: 
			System.out.println("열심히 배우고 있습니다");
			break;
		case 2: 
			System.out.println("오라클 DB 마스터~");
			break;
		case 3: 
			System.out.println("자바 마스터~");
			break;
		case 4: 
			System.out.println("JSP 마스터~");
			break;
		case 5: 
			System.out.println("팀 프로젝트 시작");
			break;
		default: 
			System.out.println("고생했어요"); 
		}
		
		
		
	}
}
