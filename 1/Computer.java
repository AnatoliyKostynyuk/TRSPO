public class Computer implements Status {
	
	private String name;

	public Computer(String name) {
		this.name=name;
	}	
	@Override
	public void turnOn() {
		System.out.println("Computer " + name + " turns on!");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer " + name + " turns off!");
	}
}