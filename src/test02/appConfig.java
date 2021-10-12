package test02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// @Configuration
// Spring bean 설정파일을 사용하던 Bean 등록을 자바의 클래스에서 할 수 있게끔 해주는 어노테이션
// @Bean : 이게 붙어앆는 메서드가 return하는 객체를 bean으로 등록

@Configuration
public class appConfig {
	
	// @Bean : 메서드명을 bean의 id로 해서 applicationContext에 등록
	@Bean
	public Book book() {
		return new Book("데미안","헤르만 헤세", 10000);
	}
}
