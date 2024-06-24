package beans;

public class Engine {
    Fuel f;
    
    public void setF(Fuel f) {
		this.f = f;
	}
	public void start() 
	{
		System.out.println("Engine start");
		f.consume();
	}
}
