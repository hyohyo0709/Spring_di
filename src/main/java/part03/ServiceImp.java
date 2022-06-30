package part03;

public class ServiceImp implements Service{

	private User user;
	
	public ServiceImp() {
		
	}
	
	
	
	public ServiceImp(User user) {
		super();
		this.user = user;
	}



	@Override
	public void prn() {
		
		System.out.printf("%s  %s \n", user.getId(), user.getPass());
	}
	
}
