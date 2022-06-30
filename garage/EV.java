package garage;

public class EV extends Vehicle {

	public void Charges() {
		System.out.println("SuperCharger");
	}

	@Override
	public void makesNoise() {
		System.out.println("Silent");
	}

	public EV(int noOfwheels, boolean hasEngine, int noOfseats, boolean hasRoof, boolean hasSidecar) {
		super(noOfwheels, hasEngine, noOfseats, hasRoof, hasSidecar);
		// TODO Auto-generated constructor stub
	}

}
