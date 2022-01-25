package Things;

public class MainOne {
	
	private String firstName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	public void print() {
		System.out.println("Hola");
	}
	
	public int plus(int a, int b) {
		return a+b;
	}
	
	public int negativ(int c, int d) {
		
		return c-d;
	}
	
public int negativNull(int c, int d) {
		int e = c-d;
		if(e<0) {
			return 0;
		}
		else {
			return e;
		}
	}

    public String identisch1() {
    	return "Hello";
    }
    
    public String identisch2() {
    	return "Hello";
    }
	
	
	public String nullP(int a) {
		return null;
	}
	
	public boolean isWhat(boolean test) {
		return test;
	}
	
	public boolean alwaysFalse() {
		return false;
	}
	
	

}
