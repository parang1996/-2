package lec10_extends_interface.stacraft;

public class HighTemplar extends ProtossUnit{
	
	private int mp = 225;
	
	public HighTemplar() {
		super("하이템플러", 0, 40, 0 ,0, 50, 150, 40);
	}
	
	public void psionicStrom() {
		System.out.println("사이오닉 스톰 시전!");
		this.mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("할루시네이션 시전!");
		this.mp -= 100;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "HighTemplar [name=" + super.getName() + ", damage=" + super.getDamage() + ", hp=" + super.getHp() + ", shield=" + super.getShield()
				+ ", attackRange=" + super.getAttackRange() + ", attackSpeed=" + super.getAttackSpeed() + ", mineral=" + super.getMineral() + ", gas="
				+ super.getGas() + ", mp=" + mp + "]";
	}
	
	
	
	
}
