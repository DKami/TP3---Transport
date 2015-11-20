package tec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tec.EtatPassager.Etat;

public class LancerTests {
	private EtatPassager etatAssis, etatDebout, etatDehors;
	
	@Before
	public void initialiser() throws Exception {
		/*etatAssis = new EtatPassager(Etat.ASSIS);
		etatDebout = new EtatPassager(Etat.DEBOUT);
	    etatDehors = new EtatPassager(Etat.DEHORS);*/
		etatAssis = EtatPassager.creerAssis();
		etatDebout = EtatPassager.creerDebout();
		etatDehors = EtatPassager.creerDehors();
	}

	@Test
	public void testAssis(){		
		System.out.println(".");

		assertFalse("Le passager ne doit pas être à l'exterieur",etatAssis.estExterieur());
		assertTrue("Le passager doit être assis",etatAssis.estAssis());
		assertFalse("Le passager ne doit pas être debout",etatAssis.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");

		assertTrue("Le passager doit être à l'exterieur",etatDehors.estExterieur());
		assertFalse("Le passager ne doit pas être assis",etatDehors.estAssis());
		assertFalse("Le passager ne doit pas être debout",etatDehors.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");

		assertFalse("Le passager ne doit pas être a l'extérieur",etatDebout.estExterieur());
		assertFalse("Le passager ne doit pas être assis",etatDebout.estAssis());
		assertTrue("Le passager doit être debout",etatDebout.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		


		assertTrue("Le passager assis doit être a l'interieur",etatAssis.estInterieur());

		assertTrue("Le passager debout de être a l'intérieur",etatDebout.estInterieur());

		assertFalse("Le passager dehors ne doit pas être a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
