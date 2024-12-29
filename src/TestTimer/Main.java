package TestTimer;

import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Task1 task1 = new Task1();
		
		timer.schedule(task1, 5, 1000);
	}

}
