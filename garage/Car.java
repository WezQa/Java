package garage;

public class Car extends Vehicle {

	public void noOfwheels() {
		System.out.println(4);
	}

	public void convertable() {
		System.out.println("Droptop");
	}

	public Car(int noOfwheels, boolean hasEngine, int noOfseats, boolean hasRoof, boolean hasSidecar) {
		super(noOfwheels, hasEngine, noOfseats, hasRoof, hasSidecar);
		// TODO Auto-generated constructor stub
	}

}
