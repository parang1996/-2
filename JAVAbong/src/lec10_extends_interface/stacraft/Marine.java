package lec10_extends_interface.stacraft;

public class Marine extends StarUnit {
	
	public Marine() {
		super("마린", 6, 40, 4, 1.0, 50, 0);
	}
	
	public void stimPack() {
		super.setAttackSpeed(0.5);
		super.setHp(super.getHp()-10);
	}

	@Override
	public String toString() {
		return "Marine [name=" + super.getName() + ", damage=" + super.getDamage() + ", hp=" + super.getHp() + ", attackRange=" + super.getAttackRange()
				+ ", attackSpeed=" + super.getAttackSpeed() + ", mineral=" + super.getMineral() + ", gas=" + super.getGas() + "]";
	}
	
	
	
}
