public class Car {
    private int numberOfWheels;
	
    public Car(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
	return numberOfWheels;
    }

    
    public void startEngine() {
	System.out.println("Start your engine which has " + numberOfWheels + " wheels");
    }

    public static void main(String[] args) {
	Car sparky = new Car(3);

	for(int i=0; i<10; i++) {
	    System.out.println("Hello")
	}
	// System.out.println(args[0]);
        // System.out.println("Testing this feature");
	// System.out.println(sparky.getNumberOfWheels());
    }
}

