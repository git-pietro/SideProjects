package MainPack;

import java.util.Timer;


public abstract class  TimerTask {

	public static void main(String[] args) {
		
	}

	abstract public void run();
	
	public boolean cancel() {
		return true;
	}
	
	public long scheduledExecutionTime() {
		
		 long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
		return freeDiskSpace;
	}
}
