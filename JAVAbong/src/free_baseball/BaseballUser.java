package free_baseball;

import java.util.ArrayList;

public class BaseballUser {
	String name;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public BaseballUser() {
	}

	public BaseballUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "BaseballUser [name=" + name + ", arr=" + arr + "]";
	}
}
