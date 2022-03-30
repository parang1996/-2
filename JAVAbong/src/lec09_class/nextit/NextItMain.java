package lec09_class.nextit;

import java.util.ArrayList;

/**
 * 실행(main 메소드)만 하는 클래스
 * @author pc21
 *
 */
public class NextItMain {
	public static void main(String[] args) {
		// 클래스 객체 선언
		Student eunji = new Student();
		
		// 객체의 필드 변수 접근
		System.out.println(eunji.name);
		System.out.println(eunji.stress);
		System.out.println(eunji.level);
		System.out.println(eunji);
		
		// 값을 할당해주지 않으면, 객체의 필드변수들은 초기값들로 설정되어 있다.
		// 숫자형 변수의 초기값 = 0
		// boolean형 변수의 초기값 = false
		// 참조형 변수의 초기값 = null
		
		System.out.println("\n==========================\n");
		
		// 객체의 상태(state), 속성 설정
		eunji.name = "은지";
		System.out.println(eunji.name);
		eunji.stress = 0;
		System.out.println(eunji.stress);
		eunji.level = 30;
		System.out.println(eunji.level);
		
		// 객체의 메소드 실행
		eunji.goToSchool();
		System.out.println(eunji.stress);
		
		eunji.eatLunch();
		eunji.goToHome();
		
		// 두 번째 객체
		Student namgyu = new Student();
		
		namgyu.name = "남규";
		namgyu.stress = 0;
		namgyu.level = 50;
		
		System.out.println(namgyu.name);
		System.out.println(namgyu.stress);
		System.out.println(namgyu.level);
		
		namgyu.goToSchool();
		namgyu.eatLunch();
		namgyu.goToHome();
		
		System.out.println("\n==============================\n");
		
		// 필드값을 입력받는 생성자로 객체 선언
		Student minwoo = new Student("민우", 0, 30);
		
		// 이름과 레벨만 입력 받는 생성자로 객체 선언
		Student beomseok = new Student("범석", 40);
		
		System.out.println("\n==============================\n");
		
		// 경로.클래스명@해시코드->16진수 문자열(hex String) 표출
		System.out.println(eunji); 
		System.out.println(eunji.hashCode());	// 메모리주소 ?
		
		// 현재 객체 정보를 한 눈에 보고 싶다면 toSting()
		System.out.println(namgyu);
		System.out.println(namgyu.toString());
		
		System.out.println("\n==============================\n");
		
		// 객체 복사
		Student copyNamgyu = new Student(namgyu.name, namgyu.stress, namgyu.level);
		
		// 객체를 리스트에 담아서 사용 (한꺼번에 뭘 하기 위해서)
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(eunji);
		stuList.add(minwoo);
		stuList.add(beomseok);
		stuList.add(namgyu);
		stuList.add(copyNamgyu);
		
		// 하루가 지났습니다. ?
		for(int i=0; i < stuList.size(); i++) {
			stuList.get(i).goToSchool();
			stuList.get(i).eatLunch();
			stuList.get(i).goToHome();
		}
		
		for(int i=0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		// 향상된 for문 사용
		for(Student stu : stuList) {
			stu.goToSchool();
			stu.eatLunch();
			stu.goToHome();
		}
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		System.out.println("\n==============================\n");
		
		// 레벨을 이용하여 정렬하기
		for(int i=0; i < stuList.size(); i++) {
			boolean swapped = false;
			for(int j=0; j < stuList.size()-1-i; j++) {
				if(stuList.get(j).level>stuList.get(j+1).level) {
					Student temp = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					swapped = true;
				}
			}
			if(swapped == false) {
				System.out.println("정렬 완료");
				break;
			}
		}
		
		// 등수와 함께 출력
		for(int i=0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i));
		}
	}
}
