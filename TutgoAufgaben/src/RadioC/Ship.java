package RadioC;

import java.util.ArrayList;

public class Ship  {
	
	private ElectronicDevice electronicDevice;

	private static ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
	
	
	public boolean load(Radio radio) {
		
		if(radio.getVolume() ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void holiday() {
		
		this.electronicDevice.off();
		
		System.out.println("Alle Geräte ausschalten");
		
	}
	
	public void deviceHinzufuegen(ElectronicDevice device) {
			
		
		
		if(device instanceof Radio) {
			
			Radio radio = (Radio)device;
			
			if(load(radio)) {
				System.out.println("Nicht hinzufügen");
			}
			else {
				devices.add(device);
				System.out.println("Remeber to pay license fee!");
			}
		
		}
		
		else {
			devices.add(device);
			
		}
		
		
		
		
	}
	
	public int numberOfRadiosSwitchedOn() {
		
		int an =0;
		
		for(int i=0; i<devices.size();i++) {
			
			if(devices.get(i).isOn() == true) {
				an++;
				
			}
		}
		
		return an;
		
				
	}
	
	
}
