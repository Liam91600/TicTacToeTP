package fr.ensma.a3.ia.mvp.agentplateau.etats;

public class EtatVide extends AbstractEtatPlateau{

	public EtatVide(IAutomatePlateau aut) {
		super(aut);
	}
	
	public void croix() throws TransitionException{
		autom.setEtatCourant(autom.getEtatCroix());
	}

}
