import static org.junit.Assert.assertFalse;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.ecl.domain.HelloWorldBean;


public class HelloWorldServiceTest {

	@Inject 
	private HelloWorldBean bean;
	
	
	@Before
	public void initWeld() {
		System.out.println("------------------");
	}
	
	@Test
	public void testBean(){
		assertFalse(null == bean);
	}
	
}
