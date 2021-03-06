package tec;


/**
 * Cette classe repr�sente l'�tat d'un passager dans un transport.
 * Il y a un �tat � l'exterieur du transport (dehors) et deux �tats � 
 * l'int�rieur (assis, debout).
 *  
 * Les instances de cette classe sont des objets constants.
 *
 * @author Georgy
 * @since 2007-2008
 **/
public class EtatPassager implements IEtatPassager{
  /**
   * D�finit les trois �tats possible d'un passager dans un transport.
   */
  public enum Etat {/** passager assis � l'int�rieur */  ASSIS, 
                    /** passager debout � l'int�rieur */ DEBOUT,  
                    /** passager � l'ext�rieur */        DEHORS};

  private final Etat monEtat;

  public static EtatPassager creerAssis(){
	  return new EtatPassager(Etat.ASSIS);
  }

  public static EtatPassager creerDehors(){
	  return new EtatPassager(Etat.DEHORS);
  }

  public static EtatPassager creerDebout(){
	  return new EtatPassager(Etat.DEBOUT);
  }
  
  
  /**
   * Construit une instance en pr�cisant l'�tat du passager.
   * 
   * @param e  valeur de l'�tat.
   */
  public EtatPassager(Etat e) {
    monEtat = e;

    /* Le constructeur d'une classe permet d'initialiser l'etat de l'instance creee.
     * Son nom correspond toujours au nom de la classe. Il n'y a pas de type de retour.
     */
  }

  public EtatPassager(){
	  this(Etat.DEHORS);
  }

  /**
   * Le passager est-il � l'ext�rieur du transport ?
   *
   * @return vrai si instanciation avec DEHORS;
   */
  public boolean estExterieur() {
	  return monEtat == Etat.DEHORS;
	  //return monEtat != Etat.ASSIS && monEtat != Etat.DEBOUT;
    
  }

  /**
   * Le passager est-il assis � l'int�rieur du transport ?
   *
   * @return vrai si instanciation avec ASSIS;
   */
  public boolean estAssis() {
    return monEtat == Etat.ASSIS;
  }

  /**
   * Le passager est-il debout � l'int�rieur du transport ?
   *
   * @return vrai si instanciation avec DEBOUT;
   */
  public boolean estDebout() {
    return monEtat == Etat.DEBOUT;
  }

  /**
   * Le passager est-il a l'int�rieur du transport ?
   *
   * @return vrai si instanciation avec ASSIS ou DEBOUT.
   */
  public boolean estInterieur() {
    return monEtat != Etat.DEHORS;
  }



  /**
   * Cette m�thode est herit�e de la classe {@link java.lang.Object}.
   * Tr�s utile pour le d�bogage, elle permet de fournir une 
   * cha�ne de caract�res correspondant � l'�tat d'un objet.
   * <p> Un code par d�faut est d�finit dans 
   * {@link java.lang.Object#toString() la classe Object} 
   * Il faut adapter (red�finir) le code de cette m�thode � chaque classe.
   *
   * Pour les cha�nes de cararct�res, l'op�rateur + correspond a la concat�nation. 
   */
  @Override
  public String toString() {
    return "<" + monEtat + ">";
  }
}