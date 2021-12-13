package Interfaces;

public interface IFernseher {
	
	
	abstract void signalEmpfangen();
	
	
	static void singal(String signal) {
		System.out.println(signal);
	}
	
	

}
