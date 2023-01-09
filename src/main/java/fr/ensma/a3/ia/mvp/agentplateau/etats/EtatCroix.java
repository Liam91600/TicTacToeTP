package fr.ensma.a3.ia.mvp.agentplateau.etats;

public class EtatCroix extends AbstractEtatPlateau{

	public EtatCroix(IAutomatePlateau aut) {
		super(aut);
	}
	
	public void click(int i) throws TransitionException{
		autom.setEtatCourant(autom.getEtatRond(), i);
	}

}
