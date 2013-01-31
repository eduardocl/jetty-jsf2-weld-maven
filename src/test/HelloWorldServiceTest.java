import javax.inject.Inject;

import org.junit.Test;


public class HelloWorldServiceTest {

	@Inject 
	private HelloWorldBean bean;
	
	@Test
	public void testBean(){
		System.out.println(bean);
	}
	
}
