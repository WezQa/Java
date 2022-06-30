package garage;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(4, true, 5, true, false);
		c.convertable();
		c.makesNoise();

		MotorBike b = new MotorBike(2, true, 1, false, true);
		b.makesNoise();
		b.SingleSeat();

		EV e = new EV(4, false, 5, true, false);
		e.makesNoise();
		e.Charges();

		ArrayList<Vehicle> garage = new ArrayList<>();
		garage.add(c);
		garage.add(e);
		garage.add(b);
	}

}
