package lec10_extends_interface.rpg;

public class Creep extends Enemy {

	public Creep(String name, int damage, int hp) {
		super(name, damage, hp);
		talk();
	}

	@Override
	public void talk() {
		System.out.println("클르ㅡㄹ르르ㅡ를");
	}
}
