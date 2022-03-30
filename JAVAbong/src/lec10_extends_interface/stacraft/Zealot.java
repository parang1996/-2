package lec10_extends_interface.stacraft;

public class Zealot extends ProtossUnit {
	
	public Zealot() {
		super("질럿", 16, 100, 1, 1.5, 100, 0, 60);
	}

	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + super.getDamage() + ", hp=" + super.getHp() + ", shield=" + super.getShield() + ", attackRange="
				+ super.getAttackRange() + ", attackSpeed=" + super.getAttackSpeed() + ", mineral=" + super.getMineral() + ", gas=" + super.getGas() + "]";
	}
	
}
