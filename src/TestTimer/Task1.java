package TestTimer;

import java.util.TimerTask;

public class Task1 extends TimerTask{
	int i = 0;

	@Override
	public void run() {
		System.out.println("task " + (++i) + " is running");
		
	}
}
