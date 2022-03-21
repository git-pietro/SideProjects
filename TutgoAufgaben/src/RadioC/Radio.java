package RadioC;

public class Radio extends ElectronicDevice{

	private boolean isOn;
	private int volume;
	private double frequency;
	private Modulation modulation;
	private double minFrequency;
	private double maxFrequency;
/*
	Radio(){
		
	}
	
	
	Radio(double frequency){
		this.frequency = frequency;
	}
	
	Radio(String station){
		this.stationNameToFrequency(station);
	}
	*/
	
	
	Radio(String name){
		super(name);
	}
	
	Radio(String name,double frequency, String station){
		super(name);
		this.frequency=frequency;
		this.stationNameToFrequency(station);
	}
	
	public Modulation getModulation() {
		return modulation;
	}

	public void setModulation(Modulation modulation) {
		this.modulation = modulation;
	    if(modulation == Modulation.AM) {
	    	this.minFrequency = 148.5;
	    	this.maxFrequency = 261000;
	    }
	    if(modulation == Modulation.FM) {
	    	this.minFrequency = 875000;
	    	this.maxFrequency = 1080000;
	    }
	    
	}

	void volumeUp() {
		if (this.volume == 100) {
			this.volume = 100;
		} else {
			this.volume++;
		}
	}

	void volumeDown() {
		if (this.volume == 0) {
			this.volume = 0;
		} else {
			this.volume--;
		}
	}
/*
	boolean isOn() {
		if (this.isOn == true) {
			return true;
		} else {
			return false;
		}
	}

	void on() {
		this.isOn = true;
		System.out.println("An");
	}

	void off() {
		this.isOn = false;
		System.out.println("Aus");
	}
*/
	public String toString() {

		return "Volume = " + this.volume + " is On =" + this.isOn + "Frequenz: " 
		+ this.frequency+" in Modul: "+modulation;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public int getVolume() {
		return this.volume;
	}
	
	static double stationNameToFrequency(String name) {
		
		switch(name) {
		
		case "Walking the Plank":
			return 98.3;
							
			default:
				return 0.0;
		}
		
	}
	
	public String toSting() {
		return "";
	}

}
