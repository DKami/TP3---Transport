package tec;

import static org.junit.Assert.*;

import org.junit.Test;

import tec.EtatPassagerMonter.Etat;

public class LancerTestsMonter {


	@Test
	public void testAssis(){
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.ASSIS);
		System.out.println(".");
		assertFalse("Le passager ne doit pas �tre � l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.DEHORS);
		assertTrue("Le passager doit �tre � l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");
		EtatPassagerMonter ep = new EtatPassagerMonter(Etat.DEBOUT);
		assertFalse("Le passager ne doit pas �tre a l'ext�rieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertTrue("Le passager doit �tre debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		
		EtatPassagerMonter etatAssis = new EtatPassagerMonter(Etat.ASSIS);
		assertTrue("Le passager assis doit �tre a l'interieur",etatAssis.estInterieur());
		EtatPassagerMonter etatDebout = new EtatPassagerMonter(Etat.DEBOUT);
		assertTrue("Le passager debout de �tre a l'int�rieur",etatDebout.estInterieur());
		EtatPassagerMonter etatDehors = new EtatPassagerMonter(Etat.DEHORS);
		assertFalse("Le passager dehors ne doit pas �tre a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
