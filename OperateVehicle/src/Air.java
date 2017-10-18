
public class Air implements Vehicle{
		public int my_speed=250;
		public int running = 0;
		
		Air(){
			
		}
		
		public void set_speed(int ss) {
			my_speed= ss;
		}
		
		public void start_running(){
			running=1;
		}
		
		public void stop_running() {
			running= 0;
		}
		
		public void speed() {
			System.out.println("My speed is "+ my_speed);		
		}
		
		public void isRunning() {
			if(running==0) {
				System.out.println("It is not running");
			}
			
			else {
				System.out.println("It is running");
			}
		}
}
