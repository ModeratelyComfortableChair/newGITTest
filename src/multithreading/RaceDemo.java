package multithreading;

public class RaceDemo {

	public static void main(String[] args) {
		Racer racer = new Racer();
		Thread tortoiseThread = new Thread(racer, "Tortoise");
		Thread hareThread = new Thread(racer, "Hare");
		
		//Starting the race
		tortoiseThread.start();
		hareThread.start();
	}

}
