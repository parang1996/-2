package submit;

public class Submit8 {

	public static void main(String[] args) {
//		다음 문자열을 중복된 숫자와 함께 출력하시오
//		aaabbcdddaeefffffgg -> a3b2c1d3a1e2f5g2
//		0,1 1,2 , 2,3		

//		String example = "aaabbcdddaeefffffgg";
		

		String example = "aaabbcdddaeefffffgg";
		int result = 0;
		for(int i=0; i<example.length()-1; i++) {
			if(example.charAt(i) == example.charAt(i+1)) {
				result++;
				if(i == example.length()-2) {
					result = result +1;
					System.out.print(example.charAt(i)+ Integer.toString(result));
				}			
			}
			if(example.charAt(i) != example.charAt(i+1)) {
				result = result +1;
				System.out.print(example.charAt(i)+ Integer.toString(result));
				result =0;
				if(i != example.length()-2) {
					result = result +1;
					System.out.print(example.charAt(i)+ Integer.toString(result));
				}
			}
		}
	}
}