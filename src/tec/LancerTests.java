package tec;

import static org.junit.Assert.*;

import org.junit.Test;

import tec.EtatPassager.Etat;

public class LancerTests {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAssis(){
		EtatPassager ep = new EtatPassager(Etat.ASSIS);
		assertFalse(ep.estExterieur());
		assertTrue(ep.estAssis());
		assertFalse(ep.estDebout());
	}
	
	
}
