
public class Do_smth {

	public void do_something(Vehicle temp) {
		
		if(temp instanceof Car) {
			((Car) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		if(temp instanceof Bus) {
			((Bus) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		if(temp instanceof Ship) {
			((Ship) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		if(temp instanceof Boat) {
			((Boat) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		if(temp instanceof Aeroplane) {
			((Aeroplane) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		if(temp instanceof Helicopter) {
			((Helicopter) temp).WhoAreYou();
			temp.speed();
			temp.isRunning();
		}
		
		
		
		
	}

}
