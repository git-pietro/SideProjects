package RadioC;

import Televison.*;

public class ElectronicDevice {

	private boolean isOn;
	private String name;
	private int watt;

	public ElectronicDevice(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... devices) {

		int number = 0;
		for (ElectronicDevice electronicDevice : devices) {
			if (electronicDevice.isOn) {
				number++;
			}
		}

		return number;

	}

	public void fahigkeit(int batterie) {
		System.out.println("Batterie größe: " + batterie);
	}

	public void on() {
		System.out.println("ON");
		this.isOn = true;
	}

	public void off() {
		System.out.println("OFF");
		this.isOn = false;
	}

	public boolean isOn() {
		if (this.isOn) {
			return true;
		} else {
			return false;
		}
	}
    @Override
	public String toString() {
		super.toString();
		return "ElectronicDevice [watt="+this.watt+"kW]";
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}
	

}
