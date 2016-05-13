package demo.practice.spring;

public abstract class Singleton {
	
	private int count = 1;
	public abstract Prototype getPrototype();
	
	public void display(){
		getPrototype().display();
		System.out.println("Singleton Count = " + count++);
	}
	
}
