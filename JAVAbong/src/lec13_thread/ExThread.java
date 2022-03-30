package lec13_thread;

public class ExThread extends Thread {
	
	int num;
	
	public ExThread(int num, String name){
		super(name);
		this.num = num;
		
	}
	
	@Override
	public void run() {
		System.out.println(super.getName());
		ThreadMain.printNumbers(num);
	}
}
