package Televison;

import RadioC.ElectronicDevice;

public class TV extends ElectronicDevice {
	
	private MonitorTube tube;
	
	public TV(String name){	
	super(name);
	this.tube = new MonitorTube();
	 
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		super.on();
		this.tube.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		super.off();
		this.tube.off();
	}

	
	
	
	}


