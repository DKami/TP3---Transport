package tec;

import static org.junit.Assert.*;

import org.junit.Test;

import tec.EtatPassagerMonter.Etat;

public class LancerTestsMonter {


	@Test
	public void testAssis(){
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.ASSIS);
		System.out.println(".");
		assertFalse("Le passager ne doit pas être à l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.DEHORS);
		assertTrue("Le passager doit être à l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.DEBOUT);
		assertFalse("Le passager ne doit pas être a l'extérieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertTrue("Le passager doit être debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		
		EtatPassagerMonter etatAssis = new EtatPassagerMonter(Etat.ASSIS);
		assertTrue("Le passager assis doit être a l'interieur",etatAssis.estInterieur());
		EtatPassagerMonter etatDebout = new EtatPassagerMonter(Etat.DEBOUT);
		assertTrue("Le passager debout de être a l'intérieur",etatDebout.estInterieur());
		EtatPassagerMonter etatDehors = new EtatPassagerMonter(Etat.DEHORS);
		assertFalse("Le passager dehors ne doit pas être a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
