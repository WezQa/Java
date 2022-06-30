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

	float bill = 0F;
	{
		for (Vehicle v : Garage.Vehicle) {
			if (v instanceof Car) {
				bill += v.getNoOfwheels() * 45;
			}
		}
	}
}