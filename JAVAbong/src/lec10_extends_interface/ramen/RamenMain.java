package lec10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		JinRamen jinramen = new JinRamen("진라면", 800);
		System.out.println(jinramen.toString());
		jinramen.printRecipe();
		
		BuldakRamen buldak = new BuldakRamen("불닭볶음면", 1200);
		System.out.println(buldak.toString());
		buldak.printRecipe();
		
	}
}
