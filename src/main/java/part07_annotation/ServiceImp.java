package part07_annotation;

public class ServiceImp implements Service{

	private User user;
	
	
	
	
	public ServiceImp(User user) {
		
		this.user = user;
	}

	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prn() {
		System.out.printf("%s  %s \n", user.getId(), user.getPass());
		
	}
}
