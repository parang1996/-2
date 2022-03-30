package note;

public class Hi extends Thread {
	String name;

	public Hi(String name) {
		super();
		this.name = name;
	}
	
	public void say() {
		System.out.println("hi");
	}
	@Override
	public void run() {
		System.out.println("hi");
	}
}
