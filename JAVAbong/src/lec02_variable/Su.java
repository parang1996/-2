package lec02_variable;

public class Su {
	public static void main(String[] args) {
		
		String findWally = "윌리울리일리울리울리일리월리일리윌리";
		
		int countWally = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			String WallyNum = findWally.substring(i, i+2);
			// errMsg String index out of range 
			// subSting 함수 사용시 잘라낼 변수의 길이가 벗어난  경우
			if(WallyNum.equals("월리")){
				countWally += 1;
				System.err.print(WallyNum);
			} else {
				System.out.print(WallyNum);
			}
		}
		
		System.out.println("월리의 갯수는 " + countWally);
	}
}
