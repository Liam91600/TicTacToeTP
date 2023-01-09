package fr.ensma.a3.ia.mvp.agentplateau.etats;

public class EtatVide extends AbstractEtatPlateau{

	public EtatVide(IAutomatePlateau aut) {
		super(aut);
	}
	
	public void click(int i) throws TransitionException{
		autom.setEtatCourant(autom.getEtatCroix(), i);
	}

}
