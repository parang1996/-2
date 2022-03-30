package lec09_class.nextit;

public class Student {
	String name;		// 학생의 이름
	int stress;		// 학생의 스트레스 지수
	int level;			// 학생의 레벨
	
	// [단축키 alt + shift + s] 또는 [마우스 우클릭 - source]
	// generate constructor using fields
	
	public Student(String name, int stress, int level) {
		this(); 		// 현재 객체의 기본생성자
		//super();
		this.name = name;
		this.stress = stress;
		this.level = level;
	}
	
	// 메소드 오버로딩과 매우 유사
	public Student (String name, int level){
		// 방법 1
//		this();
//		this.name = name;
//		this.stress = 0;			// 기본값(default) 주기		
//		this.level = level;
		
		// 방법 2
		this(name, 0, level);
		// 방법 3
		// 필드값에 값을 초기화 시켜준다.
	}
	// 기본 생성자
	// 클래스 내에 생정자를 따로 만들지 않았다면 생략된 상태로 존재하고 있다.
	// 생성자를 따로 만들었다면, 기본생성자를 이용하기 위해선 만들어줘야 한다.
	public Student() {
		System.out.println("기본생성자에서 나온 씨스오");
	}
		
	@Override // 커스텀 가능
	public String toString() {
		return "[이름: " + name + ", 스트레스: " + stress + ", 레벨: " + level + "]";
	}

	public void goToSchool() {
		System.out.println(name + "씨가 학원에 도착했습니다.");
		stress += 100;
	}

	public void eatLunch() {
		System.out.println(name + "씨가 점심을 먹습니다.");
		stress -= 50;
	}
	
	public void goToHome() {
		System.out.println(name + "씨가 집으로 귀가합니다.");
		stress =0;
		levelUp();
	}
	
	public void levelUp() {
		int randInt = (int)(Math.random()*5+1);
		level += randInt;
		System.out.println(name + "씨가 " + level +"만큼 레벨업을 하였습니다.");
	}
}
