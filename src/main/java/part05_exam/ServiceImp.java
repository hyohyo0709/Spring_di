package part05_exam;

public class ServiceImp implements Service{

	private MemDaoImp mem;
	
	
	
	public ServiceImp(MemDaoImp mem) {
		super();
		this.mem = mem;
	}
	
	public void setMem(MemDaoImp mem) {
		this.mem = mem;
	}
	

	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prn() {
		
		mem.selectMethod();
	}
}
