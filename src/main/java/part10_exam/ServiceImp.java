package part10_exam;


import java.util.List;
import java.util.TreeSet;

public class ServiceImp implements Service{

	
	private List<String> list;
	
	

	public ServiceImp(List<String> list) {
		
		this.list = list;
	}
	
	
	

	public List<String> getList() {
		return list;
	}




	public void setList(List<String> list) {
		this.list = list;
	}




	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prn() {
		
		TreeSet<String> tset = new TreeSet<String>(list);
		while(!tset.isEmpty()) {
			System.out.println(tset.pollFirst());
		}
			
			
			System.out.println("//////////////////////////////////////////");
			
		for(String ll : list) {
			System.out.println(ll);
		}
		
	}
}
