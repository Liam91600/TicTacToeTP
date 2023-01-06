package fr.ensma.a3.ia.mvp.agentplateau;

import java.util.List;

import fr.ensma.a3.ia.mvp.agentcase.ICaseObserver;
import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;
import fr.ensma.a3.ia.mvp.agentplateau.etats.IAutomatePlateau;
import fr.ensma.a3.ia.mvp.agentplateau.etats.IEtatPlateau;

public class PresentationPlateau implements ICaseObserver, IAutomatePlateau{

	private VuePlateau vuePlateau;
	private List<PresentationCase> presentationCases;

	private IEtatPlateau etatCourant;
	private IEtatPlateau etatCroix;
	private IEtatPlateau etatRond;
	private IEtatPlateau etatVide;
	
	@Override
	public void notifyClick() {
		// TODO Auto-generated method stub
		
	}



	public void setListePresCase(List<PresentationCase> pc) {
		presentationCases = pc;
		
	}



	@Override
	public void setEtatCourant(IEtatPlateau etat) {
		etatCourant = etat;
	}
	@Override
	public IEtatPlateau getEtatCroix() {
		return etatCroix;
	}
	@Override
	public IEtatPlateau getEtatRond() {
		return etatRond;
	}
	@Override
	public IEtatPlateau getEtatVide() {
		return etatVide;
	}
	

}
