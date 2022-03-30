package lec13_thread;

public class MakeString {

	public static void main(String[] args) {
		// 문자열을 아주 길~게 만들어보자
		String result = "";
//		StringBuffer sbResult = new StringBuffer("");			// 개빠름
		StringBuilder sbResult = new StringBuilder("");			// 동기화가 안되있어서 데이터 손실이 일어남.
		
		// 하나의 일을 스레드로 동시작업 하게 하지 않음 ( 느리다 ? )
		// 여러 일을 분배해서 시킬 때 스레드를 쓴
		
		for(int i = 0; i < 100000000; i++) {
//			result += (int)(Math.random()*10);
			sbResult.append((int)(Math.random()*10));
			if(i % 10000000 == 0) {
				System.out.println(i + "...");
			}
		}
//		System.out.println(result.length());
		System.out.println(sbResult.length());

		
		System.out.println("\n=======================================\n");
		
		Thread thread1 = new Thread(()-> {
			for(int i = 0; i < 50000000; i++) {
				sbResult.append((int)(Math.random()*10));
				if(i % 1000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		},"유진");
		
		Thread thread2 = new Thread(()-> {
			for(int i = 0; i < 50000000; i++) {
				sbResult.append((int)(Math.random()*10));
				if(i % 1000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		},"예반");
		
		thread1.start();
		thread2.start();
		
		
	}

}
