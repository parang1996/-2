package lec09_class.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		// 기본생성자 Member(){} 를 안 만들어주면 아래처럼 소환 못함
		Member minwoo = new Member();
		
		minwoo.id = "minwoo";
		minwoo.passWord = "1q2w";
		minwoo.name = "민우";
		
		Member beomseok = new Member("beomseok", "1234", "범석");
		
		System.out.println(minwoo); 	// 바로 출력 안됨 (to.String 만들기전)
		System.out.println(minwoo.toString()); // to.String 만들고 난 후, to.String 생략가능, 커스텀 가능
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(minwoo);
		memberList.add(beomseok);
		System.out.println(memberList);
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("행동을 선택해주세요");
			System.out.println("1.회원가입 | 2.회원조회 | 3.회원탈퇴 | 4.종료");
			System.out.print(">>>");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				// TODO 회원가입
				System.out.print("아이디를 입력해주세요 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요 : ");
				String pw = sc.nextLine();
				System.out.print("이름를 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.println("회원가입이 완료되었습니다 !");
//				Member AAA = new Member(id, pw, name);
//				memberList.add(AAA);
//				아이디 중복체크
				boolean isDuple = false;
				for(Member member : memberList) {
					if(member.id.equals(id)) {
						isDuple = true;
					}
				}
				if(!isDuple) {
					memberList.add(new Member(id, pw, name));					
				}else {
					System.out.println("중복된 아이디입니다.");
				}
			}else if(command == 2) {
				// TODO 회원조회
				System.out.println("현재 회원 명단 : ");
				for(Member member : memberList) {
					System.out.println(member);
				}
//				System.out.println(memberList);
			}else if(command == 3) {
				// TODO 회원탈퇴
				System.out.print("탈퇴 할 아이디를 입력해주세요 : ");
				String rmId = sc.nextLine();
				Member temp = null;
				for(Member member : memberList) {
					if(member.id.equals(rmId)) {
						temp = member;
					}
					System.out.println(member + "는 탈퇴되었습니다.");
				}
					memberList.remove(temp);
			}else if(command == 4) {
				// 종료
				System.out.println("종료하였습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
