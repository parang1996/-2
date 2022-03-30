package lec10_extends_interface.rpg;

public class Warrior extends Character {
	private Jobs job;

	public Warrior(String name, int damage, int hp, Jobs job) {
		// 부모 생성자(super)가 가장 위에 있어야 한다.
		super(name, damage, hp);
		this.job = job;
	}

	// 공격시 두 배의 데미지를 주고 싶다면
	@Override
	public void attack(Enemy enemy) {
		System.out.println(super.getName() + "이(가) " + enemy.getName() + "를 공격합니다");

		enemy.setHp(enemy.getHp() - super.getDamage() * 2);
		super.setHp(super.getHp() - enemy.getDamage());
		if (enemy.getHp() <= 0) {
			enemy.die();
		}
		if (super.getHp() <= 0) {
			die();
		}
	}

	@Override
	public void skill(Enemy enemy) {
		switch (job) {
		case BERSERKER:
			System.out.println("파워스트라이크");
			enemy.setHp(enemy.getHp() - 150);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		case WARLOAD:
			System.out.println("버스트 캐논");
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
	
	// enum 클래스 (열거형 클래스), (inner 클래스)
	// Constants 처럼 사용 (더 편하게?)
	// 값은 따로 없음
	enum Jobs{
		BERSERKER,
		WARLOAD
	}
}
