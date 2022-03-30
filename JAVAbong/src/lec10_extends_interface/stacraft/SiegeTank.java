package lec10_extends_interface.stacraft;

public class SiegeTank extends StarUnit {
	
	public SiegeTank() {
		super("시즈탱크", 20, 100, 6, 1.0, 70, 0);
	}
	
	public void siegeMode() {
		System.out.println("시즈모드");
		super.setDamage(70);
		super.setAttackRange(12);	
	}

	@Override
	public String toString() {
		return "SiegeTank [getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()=" + getHp()
				+ ", getAttackRange()=" + getAttackRange() + ", getAttackSpeed()=" + getAttackSpeed()
				+ ", getMineral()=" + getMineral() + ", getGas()=" + getGas() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
