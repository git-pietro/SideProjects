package RadioC;

public class Firebox extends ElectronicDevice{
	
	Firebox(String name){
		super(name);
		on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		super.off();
		this.setOn(true);
		
	}
	
	
	

}
