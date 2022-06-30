package part08_lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/*
 * BeanNameAware : 빈 객체가 자신의 이름을 알아햐 할 때 사용
 * BeanFactoryAware : 빈 자체에 대한 정보를 알려준다
 * 
 * ApplicationContextAware : ApplicationContext를 빈에 전달할 때 사용된다  
 * InitializingBean : 객체를 생성하고 프로퍼티를 초기화하고, 컨테이너에 관련 설정을 완료한 뒤에 호출
 * 
 * DisposableBean : 스프링은 빈 객체를 컨테이너에서 제거하기 전에 DisposableBean 인터페이스에
 * 					정의된 메소드를 호출하여 빈 객체가 자원을 반납할 수 있도록 한다
 * 
 */
public class ServiceImp implements Service, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
InitializingBean{

	private String beanName;
	
	
	public ServiceImp() {
		System.out.println("constructor");
	}
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("beanName: "+ beanName);
		
	}
	
	
	
	public void before() {
		System.out.println("before");
	}
	
	@Override
	public void prn() {
		System.out.println("prn method");
		
	}
	
	public void end() {
		System.out.println("end");

	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 특별히 호출해주는게 없는데 DisposableBean 얘 때문에 출력");

	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory:" + beanFactory.getBean(beanName));
		System.out.println("beanFactory:" + beanFactory.getType(beanName));
		
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("context:" + applicationContext.getBeanDefinitionCount()); // 현재 컨테이너에 생성된 빈의 갯수
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("빈 생성 완료");
		
	}
	
	
}
