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

		assertFalse("Le passager ne doit pas �tre � l'exterieur",etatAssis.estExterieur());
		assertTrue("Le passager doit �tre assis",etatAssis.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",etatAssis.estDebout());
	}
	
	@Test
	public void testExterieur(){
		System.out.println(".");

		assertTrue("Le passager doit �tre � l'exterieur",etatDehors.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",etatDehors.estAssis());
		assertFalse("Le passager ne doit pas �tre debout",etatDehors.estDebout());
	}	
	
	@Test
	public void testDebout(){
		System.out.println(".");

		assertFalse("Le passager ne doit pas �tre a l'ext�rieur",etatDebout.estExterieur());
		assertFalse("Le passager ne doit pas �tre assis",etatDebout.estAssis());
		assertTrue("Le passager doit �tre debout",etatDebout.estDebout());	
	}
	
	@Test
	public void testInterieur(){
		System.out.println(".");		


		assertTrue("Le passager assis doit �tre a l'interieur",etatAssis.estInterieur());

		assertTrue("Le passager debout de �tre a l'int�rieur",etatDebout.estInterieur());

		assertFalse("Le passager dehors ne doit pas �tre a l'interieur",etatDehors.estInterieur());
	}
	
	@Test
	public void toutLesTestReussi(){
		System.out.println("OK");
	}
}
