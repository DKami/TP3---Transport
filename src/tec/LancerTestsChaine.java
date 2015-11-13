package tec;

import static org.junit.Assert.*;

import org.junit.Test;

public class LancerTestsChaine {

	@Test
	public void testAssis(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("ASSIS");
		assertFalse("Le passager ne doit pas �tre � l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("DEHORS");
		assertTrue("Le passager doit �tre � l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("DEBOUT");
		assertFalse("Le passager ne doit pas �tre a l'ext�rieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",ep.estAssis());
		assertTrue("Le passager doit �tre debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		
		EtatPassagerChaine etatAssis = new EtatPassagerChaine("ASSIS");
		assertTrue("Le passager assis doit �tre a l'interieur",etatAssis.estInterieur());
		EtatPassagerChaine etatDebout = new EtatPassagerChaine("DEBOUT");
		assertTrue("Le passager debout de �tre a l'int�rieur",etatDebout.estInterieur());
		EtatPassagerChaine etatDehors = new EtatPassagerChaine("DEHORS");
		assertFalse("Le passager dehors ne doit pas �tre a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
