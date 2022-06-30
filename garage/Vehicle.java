package garage;

public class Vehicle {

	private int noOfwheels;
	private boolean hasEngine;
	private int noOfseats;
	private boolean hasRoof;
	private boolean hasSidecar;

	public Vehicle(int noOfwheels, boolean hasEngine, int noOfseats, boolean hasRoof, boolean hasSidecar) {
		super();
		this.noOfwheels = noOfwheels;
		this.hasEngine = hasEngine;
		this.noOfseats = noOfseats;
		this.hasRoof = hasRoof;
		this.hasSidecar = hasSidecar;
	}

	public void makesNoise() {
		System.out.println("Revs");
	}

	public int getNoOfwheels() {
		return noOfwheels;
	}

	public void setNoOfwheels(int noOfwheels) {
		this.noOfwheels = noOfwheels;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public int getNoOfseats() {
		return noOfseats;
	}

	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}

	public boolean isHasRoof() {
		return hasRoof;
	}

	public void setHasRoof(boolean hasRoof) {
		this.hasRoof = hasRoof;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

}
