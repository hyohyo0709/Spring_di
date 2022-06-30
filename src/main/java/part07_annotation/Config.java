package part07_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//현재 클래스(Config)를 스프링 환경설정으로 사용함을 의미
@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * <bean id="user" class="part07_annotation.User">
	 * <constructor-arg>
	 * <value> kim </value>
	 * <value> a1234 </value>
	 * </constructor-arg>
	 * 주르르륵 xml 파일에서 하던 방식
	 * 
	 * 
	 */
	
	
	
	
	
	@Bean
	public User user() {
		return new User("kim", "a1234");
	}
	
//	@Bean을 선언할 때 이름 속성을 지정 안 하면 메소드명이 빈id가 된다
	@Bean
	public ServiceImp svc() {
		return new ServiceImp(user());
	}
	
//	@Bean에 이름을 지정해주면 그 이름이 빈id가 된다
	@Bean (name = "ss")
	public ServiceImp smp() {
		return new ServiceImp(user());
	}
	
	
}
