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
	
	public void testDebout(){
		
		EtatPassager ep = new EtatPassager(Etat.DEBOUT);
		assertFalse("Le passager ne doit pas �tre a l'ext�rieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertTrue("Le passager doit �tre debout",ep.estDebout());
		
	}
	
	public void testInterieur(){
		
		EtatPassager etatAssis = new EtatPassager(Etat.ASSIS);
		assertTrue("Le passager assis doit �tre a l'interieur",etatAssis.estInterieur());
		EtatPassager etatDebout = new EtatPassager(Etat.DEBOUT);
		assertTrue("Le passager debout de �tre a l'int�rieur",etatDebout.estInterieur());
		EtatPassager etatDehors = new EtatPassager(Etat.DEHORS);
		assertFalse("Le passager dehors ne doit pas �tre a l'interieur",etatDehors.estInterieur());
	}
}
