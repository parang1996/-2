package lec10_extends_interface.ramen;
// 추상 메소드를 가지고 있는 클래스는
// 무.조.건 추상 클래스로 선언해야 한다.
public abstract class Ramen {
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 라면의 레시피를 출력해주는 함수
	// 라면마다 레시피가 다를 경우
	// 추상 메소드를 만든다.
	public abstract void printRecipe();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ramen [name=" + name + ", price=" + price + "]";
	}
}