package lec13_thread.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Ramen ramen = new Ramen(factory);
		factory.endFactory = new EndFactory() {

			@Override
			public void theEnd() {
				
			}
			
		};
		Thread thread1 = new Thread(ramen, "면");
		thread1.start();
		
		Thread thread2 = new Thread(new Soup(factory), "스프");
		thread2.start();
		
		new Thread(new Packing(factory), "포장").start();
	}
}
