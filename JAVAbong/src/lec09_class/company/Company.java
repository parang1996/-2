package lec09_class.company;

import java.util.ArrayList;
	
public class Company {
	
	ArrayList<Worker> workerList = new ArrayList<Worker>();
	int history; 		// 회사 역사
	
	// 싱글톤 (singleton) 적용
	// 기본생성자에 private 붙여 다른데서 사용할 수 없도록 만든다.
	private Company(){
	}
	
	private static Company instance = new Company();
	
	public static Company getInstance() {
		return instance;
	}
	
	// 직원 목록 출력
	public void showList() {
		for(Worker wk : workerList) {
			System.out.println(wk);
		}
	}
	
	// 회사 연수 year만큼 증가
	public void addHistory(int year) {
		for(Worker wk : workerList) {
			wk.addExp(year);
		}
	}
	
	// 사원 해고
	public void fireWorker(Worker worker) {
		System.out.println(worker.getPosition() + " " + worker.getName() + "을(를) 해고했어요.");
		workerList.remove(worker);
	}
}
