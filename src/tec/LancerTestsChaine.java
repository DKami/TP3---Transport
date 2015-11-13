package tec;

import static org.junit.Assert.*;

import org.junit.Test;

public class LancerTestsChaine {

	@Test
	public void testAssis(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("ASSIS");
		assertFalse("Le passager ne doit pas être à l'exterieur",ep.estExterieur());
		assertTrue("Le passager doit être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("DEHORS");
		assertTrue("Le passager doit être à l'exterieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertFalse("Le passager ne doit pas être debout",ep.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");
		EtatPassagerChaine ep = new EtatPassagerChaine("DEBOUT");
		assertFalse("Le passager ne doit pas être a l'extérieur",ep.estExterieur());
		assertFalse("Le passager ne doit pas être assis",ep.estAssis());
		assertTrue("Le passager doit être debout",ep.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		
		EtatPassagerChaine etatAssis = new EtatPassagerChaine("ASSIS");
		assertTrue("Le passager assis doit être a l'interieur",etatAssis.estInterieur());
		EtatPassagerChaine etatDebout = new EtatPassagerChaine("DEBOUT");
		assertTrue("Le passager debout de être a l'intérieur",etatDebout.estInterieur());
		EtatPassagerChaine etatDehors = new EtatPassagerChaine("DEHORS");
		assertFalse("Le passager dehors ne doit pas être a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
