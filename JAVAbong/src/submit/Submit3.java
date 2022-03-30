package submit;

public class Submit3 {
	public static void main(String[] args) {
		// 명함 만들기
		String info = "정찬웅, 010-7398-7332, akow283@gmail.com";
		System.out.println("==========================");
		String[] split2 = new String[3];
		split2 = info.split(", ");
		System.out.println("이름 : " + split2[0]);
		System.out.println("이름 : " + split2[1]);
		System.out.println("이름 : " + split2[2]);
		System.out.println("==========================");
		
	}
}
