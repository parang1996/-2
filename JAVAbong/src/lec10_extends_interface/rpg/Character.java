package lec10_extends_interface.rpg;

public abstract class Character {
	private String name;
	private int damage;
	private int hp;
	
	public Battle battle;
	
	public Character(String name, int damage, int hp) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
	}
	// 공격
	public void attack(Enemy enemy) {
		enemy.setHp(enemy.getHp() - this.damage);
		this.hp -= enemy.getDamage();
		
		if(enemy.getHp() <= 0) {
			enemy.die();
		}
		if(this.hp <= 0) {
			die();
		}
	}
	
	public abstract void skill(Enemy enemy);
	
	// 죽음	
	public void die() {
		System.out.println(this.name + "이(가) 사망하셨습니다.");
		battle.outOfBattle();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Character [name=" + name + ", damage=" + damage + ", hp=" + hp + "]";
	}
}
