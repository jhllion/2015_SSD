package sw_week_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import defect.CharacterStack;

public class CharacterStackTest  {
	int MAX_SIZE = 20;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test 
	public void testCharacterStack(){
		CharacterStack character_stack = new CharacterStack();
		assertTrue(character_stack.getSize() ==0);
		assertEquals(MAX_SIZE , character_stack.getMaxSize());	
	}

}
