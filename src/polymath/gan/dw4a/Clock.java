package polymath.gan.dw4a;

public class Clock {
	public int x;
	
	public Clock(int x) {
		this.x = x;
	}
	
	public void countdown() {
		Clock clock = new Clock(x);
		clock.x -= x;
	}

}
