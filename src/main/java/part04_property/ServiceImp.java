package part04_property;

import java.util.Random;

public class ServiceImp implements Service{

	private String name;
	private Random ran;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRan(Random ran) {
		this.ran = ran;
	}
	
	
	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void prn1() {
		System.out.printf("name: %s", name);
		
	}
	
	
	@Override
	public void prn2() {
		System.out.printf("ran: %.2f\n", ran.nextDouble());
		
	}
}
