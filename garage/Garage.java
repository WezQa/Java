package garage;

import java.util.ArrayList;

public class Garage {

	private static ArrayList<Vehicle> Vehicle = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		Garage.Vehicle.add(v);
	}

	public void removeVehicle(Vehicle v) {
		Garage.Vehicle.remove(v);
	}

	static float bill = 0F;
	{
		for (Vehicle v : Garage.Vehicle) {
			if (v instanceof Car) {
				bill += v.getNoOfwheels() * 55;
				if (v instanceof MotorBike) {
					bill += v.getNoOfwheels() * 37;
					if (v instanceof EV) {
						bill += v.getNoOfwheels() * 60;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(bill);
	}
}