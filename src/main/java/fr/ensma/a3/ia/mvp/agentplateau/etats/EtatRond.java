package fr.ensma.a3.ia.mvp.agentplateau.etats;

public class EtatRond extends AbstractEtatPlateau{

	public EtatRond(IAutomatePlateau aut) {
		super(aut);
	}

	public void vide() throws TransitionException{
		autom.setEtatCourant(autom.getEtatVide());
	}
}
