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
		assertFalse("Le passager ne doit pas être à l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}
	
	public void testExterieur(){
		EtatPassager ep = new EtatPassager(Etat.DEHORS);
		assertTrue("Le passager doit être à l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}
}
