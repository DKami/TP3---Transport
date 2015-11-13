package tec;

import static org.junit.Assert.*;

import org.junit.Test;

import tec.EtatPassager.Etat;

public class LancerTests {



	@Test
	public void testAssis(){
		EtatPassager ep = new EtatPassager(Etat.ASSIS);
		assertFalse("Le passager ne doit pas être à l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		EtatPassager ep = new EtatPassager(Etat.DEHORS);
		assertTrue("Le passager doit être à l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		EtatPassager ep = new EtatPassager(Etat.DEBOUT);
		assertFalse("Le passager ne doit pas être a l'extérieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertTrue("Le passager doit être debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		
		EtatPassager etatAssis = new EtatPassager(Etat.ASSIS);
		assertTrue("Le passager assis doit être a l'interieur",etatAssis.estInterieur());
		EtatPassager etatDebout = new EtatPassager(Etat.DEBOUT);
		assertTrue("Le passager debout de être a l'intérieur",etatDebout.estInterieur());
		EtatPassager etatDehors = new EtatPassager(Etat.DEHORS);
		assertFalse("Le passager dehors ne doit pas être a l'interieur",etatDehors.estInterieur());
	}
}
