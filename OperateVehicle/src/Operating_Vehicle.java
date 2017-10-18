
public class Operating_Vehicle {

	public static void main(String[] args) {
		Do_smth doo= new Do_smth();
		
		Vehicle car= new Car();
		doo.do_something(car);
		System.out.println();
		
		
		Vehicle bus= new Bus();
		doo.do_something(bus);
		System.out.println();

		
		Vehicle ship= new Ship();
		doo.do_something(ship);
		System.out.println();

		
		Vehicle boat= new Boat();
		doo.do_something(boat);
		System.out.println();

		
		Vehicle aero= new Aeroplane();
		doo.do_something(aero);
		System.out.println();

		
		Vehicle heli= new Helicopter();
		doo.do_something(heli);
		System.out.println();

		

	}

}
