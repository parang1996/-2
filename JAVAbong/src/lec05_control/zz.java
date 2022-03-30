package lec05_control;

public class zz {

	public static void main(String[] args) {
		
		// 거꾸로 구구단 2단 출력
		for(int i=9; i > 0; i--) {			
			System.out.println("2 X " + i + " = " + (2*i) );
		}
		
		String ss= "";
		for(int i=1; i <= 5; i++) {
			ss += "*";
			System.out.println(ss);
		}
		
		System.out.println("\n");
		
		String dd = "*****";
		for(int i=5; i > 0; i--) {
			System.out.println(dd);
			dd += "";
		}
		
	}

}
