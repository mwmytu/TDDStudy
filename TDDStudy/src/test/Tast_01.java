package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.ADD;

import org.junit.jupiter.api.Test;

public class Tast_01 {
	
	@Test
	public void test_1() {
		
		ADD add=new ADD();
		int ret=add.getResult(1,2);
		assertEquals(3,ret);
		
	}
}
