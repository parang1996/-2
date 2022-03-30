package lec09_class.school;

import java.util.ArrayList;

import lec09_class.UtillClass;

public class SchoolMain {
	
	int intVal = 10;
	static String strVal = "스테틱의 단검";
	
/**
 * 실행(main) 만을 담당하는 클래스 
 * @param args
 */
	public static void main(String[] args) {
		// 클래스 개체로 선언
		Student minwoo = new Student();
		// 객체 뒤에 점 (.) 찍으면 객체가 가지고 있는 변수의 메소드에 접근이 가능하다.
		System.out.println(minwoo.name);
		
		// 객체가 가진 메소드 샐행
		// 값을 초기화하지 않았다면, 필드변수들은 초기값들도 설정되어 있다.
		// 기본타입(숫자, boolean), 참조타입
		// 숫자는 0, 실수는 0.0
		// boolean false, 참조타입 null
		minwoo.state(); 
		
		// 객체의 상태(state) 설정
		minwoo.name = "민우";
		minwoo.kor = 90;
		minwoo.eng = 80;
		minwoo.math = 75;
		minwoo.avg = (90 + 80 + 75) / 3.0;
		minwoo.isMan = true;
		
		System.out.println(minwoo);
		System.out.println("여기");
		
		minwoo.state();
		
		// 두번째 객체 선언
		Student beomseok = new Student();
		
		beomseok.name = "범석";
		beomseok.kor = 80;
		beomseok.eng = 83;
		beomseok.math = 88;
		beomseok.isMan = true;
		
		beomseok.state();
		
		System.out.println(beomseok.avg);
		
		System.out.println("\n=====================\n");
		
		// 필드값을 입력 받는 생성자(constructor)로 객체 만들기
		Student yujin = new Student("유진", 90, 93, 30, (90+93+30)/3.0, false);
		yujin.state();
		
		// 평균을 입력받지 않아도 되는 생성자 사용하기
		Student sangwoo = new Student("상우", 80, 70, 91, true);
		sangwoo.state();
		
		// static 변수나 메소드는 클래스를 객체로 만들지 않아도 바로 사용 가능하다.
		System.out.println(UtillClass.owner);
		
		//SchoolMain scSM = new SchoolMain;
		//System.out.println(intVal);
		//System.out.println(SchoolMain.intVal);
		
		System.out.println(SchoolMain.strVal);
		System.out.println(strVal);
	
		// 객체 복사 ( 잘못된 예시 )
		Student sangwoo2 = sangwoo;
		
		System.out.println(sangwoo);
		System.out.println(sangwoo2);
		System.out.println(sangwoo.hashCode());
		System.out.println(sangwoo2.hashCode());
		
		sangwoo2.avg = 100;
		System.out.println(sangwoo.avg);
		
		// 객체 복사 ( 맞는 예시 )
		Student sangwoo3 = new Student(sangwoo.name, sangwoo.kor, sangwoo.eng, sangwoo.math, sangwoo.isMan);
		sangwoo3.state();
		
		System.out.println("\n=====================\n");
		
		// syso 로 객체 만들기
		// 클래스 내에서 toString을 @Override 하면 된다.
		System.out.println(minwoo);
		
		System.out.println("\n=====================\n");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		Student a1w2 = new Student();
		a1w2.name = "아아";
		stuList.add(a1w2);
		stuList.add(minwoo);
		stuList.add(beomseok);
		stuList.add(yujin);
		stuList.add(sangwoo);
		stuList.add(new Student("용석", 80, 70, 75, true));
		stuList.add(new Student("지혜", 80, 71, 75, false));
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		// stuList 안의 학생들의 평균을 이용해서
		// 종합 성적표를 출력해주세요.
		// 1등. 상우 국어 ~ ...
		// 2등. XX ~ ...
		
		
	}

}
