package day5;

public class Pill implements Jack, Jill{
	@Override
	public void dancing() {
		System.out.println("Kathak");
	}
	
	@Override
	public void playing() {
		System.out.println("Cricket");
	}
	
	@Override
	public void singing() {
		System.out.println("Classical");
	}
}
