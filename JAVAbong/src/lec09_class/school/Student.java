package lec09_class.school;

import lec09_class.UtillClass;

/**
 * 학생 객체를 생성하기 위한 클래스
 */
public class Student {
//	학생 (Student) 클래스의 상태(state)를 필드 변수로 선언
//	필드 변수의 값을 꼭 초기회 (int a = 5) 하지 않아도 된다.
	String name;		// 학생의 이름
	int kor;			// 학생의 국어점수
	int eng;			// 학생의 영어점수
	int math;			// 학생의 수학점수
	double avg;			// 학생의 평균점수
	boolean isMan;
	
	// 기본 생성자
	// 따로 만들지 않아도 자동으로 존재한다.
	Student(){
		
	}
	
	// 단축키 [Alt + Shift + S] 혹은 마우스 우클릭 - Source]
	// Generate Constructor using Field 클릭 후 Generate 클릭
	
	public Student(String name, int kor, int eng, int math, double avg, boolean isMan) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.isMan = isMan;
	}
	// 메소드 오버로딩과 매우 흡사
	
	public Student(String name, int kor, int eng, int math, boolean isMan) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		double average = (kor + eng + math) / 3.0;
		this.avg = UtillClass.round(average, 2);
		this.isMan = isMan;
	}
	
	//성적표 출력
	public void state() {
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		avg = UtillClass.round((kor + eng + math) / 3.0, 2);
		System.out.println("평균 : " + avg);
		System.out.println("성별 : " + isMan);	
	}
	
	// Override 는 기존의 메소드를 재정의 하는 걸 말한다.
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg
				+ ", isMan=" + isMan + "]";
	}
}
