package lec10_extends_interface.rpg;

public class Magician extends Character {
	private Jobs job;
	
	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}
	

	enum Jobs{
		FIRE,
		ICE
	}
	
	@Override
	public void skill(Enemy enemy) {
		switch (job) {
		case FIRE:
			System.out.println("파이어ㅓㅓㅓㅓ");
			enemy.setHp(enemy.getHp() - 150);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		case ICE:
			System.out.println("아이쓰ㅡ으으으으");
			enemy.setHp(enemy.getHp() - 200);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;

		default:
			System.out.println("노직업");
			break;
		}
		
	}
}