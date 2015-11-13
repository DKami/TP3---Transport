package tec;

import static org.junit.Assert.*;

import org.junit.Test;

import tec.EtatPassager.Etat;

public class LancerTests {



	@Test
	public void testAssis(){
		EtatPassager ep = new EtatPassager(Etat.ASSIS);
		System.out.println(".");
		assertFalse("Le passager ne doit pas �tre � l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");
		EtatPassager ep = new EtatPassager(Etat.DEHORS);
		assertTrue("Le passager doit �tre � l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");
		EtatPassager ep = new EtatPassager(Etat.DEBOUT);
		assertFalse("Le passager ne doit pas �tre a l'ext�rieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertTrue("Le passager doit �tre debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		
		EtatPassager etatAssis = new EtatPassager(Etat.ASSIS);
		assertTrue("Le passager assis doit �tre a l'interieur",etatAssis.estInterieur());
		EtatPassager etatDebout = new EtatPassager(Etat.DEBOUT);
		assertTrue("Le passager debout de �tre a l'int�rieur",etatDebout.estInterieur());
		EtatPassager etatDehors = new EtatPassager(Etat.DEHORS);
		assertFalse("Le passager dehors ne doit pas �tre a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
		//aaaaaaaaaaaaaaaaaa
		//aaaaaaaaaaaaaaaaaa
		//aaaaaaaaaaaaaaaaaa
	}
}
