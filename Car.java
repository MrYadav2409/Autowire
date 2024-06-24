package beans;

public class Car {

	 Engine engine;
	 
	 public void setEngine(Engine engine) {
		this.engine = engine;
	}
	 
	public void run() 
	{
		System.out.println("Car is running");
		engine.start();
		
	}
	
}
