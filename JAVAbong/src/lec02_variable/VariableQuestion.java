package lec02_variable;

public class VariableQuestion {

	public static void main(String[] args) {
		
		String enigma = "너오구늘리뭐너먹구지리";		
		enigma = enigma.replace("너", "").replace("구","")
				.replace("리","");
		System.out.println(enigma);
		
		String way1 = enigma.replace("너", "");
		String way2 = way1.replace("구", "");
		String way3 = way2.replace("리", "");
		System.out.println(way3);
		
	}

}
