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
		assertFalse("Le passager ne doit pas �tre � l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}
	
	public void testExterieur(){
		EtatPassager ep = new EtatPassager(Etat.DEHORS);
		assertTrue("Le passager doit �tre � l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}
}
