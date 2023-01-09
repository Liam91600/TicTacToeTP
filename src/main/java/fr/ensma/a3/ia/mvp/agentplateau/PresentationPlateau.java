package fr.ensma.a3.ia.mvp.agentplateau;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mvp.agentcase.ICaseObserver;
import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;
import fr.ensma.a3.ia.mvp.agentplateau.etats.TransitionException;
import fr.ensma.a3.ia.mvp.agentplateau.etats.EtatCroix;
import fr.ensma.a3.ia.mvp.agentplateau.etats.EtatRond;
import fr.ensma.a3.ia.mvp.agentplateau.etats.EtatVide;
import fr.ensma.a3.ia.mvp.agentplateau.etats.IAutomatePlateau;
import fr.ensma.a3.ia.mvp.agentplateau.etats.IEtatPlateau;

public class PresentationPlateau implements ICaseObserver, IAutomatePlateau{

	private IMediateurPlateau vuePlateau;
	private List<PresentationCase> presentationCases;

	private List<IEtatPlateau> etatCourants;
	private IEtatPlateau etatCroix;
	private IEtatPlateau etatRond;
	private IEtatPlateau etatVide;
	
	public PresentationPlateau() {
		
		vuePlateau.setPresentation(this);
		
		etatCroix = new EtatCroix(this);
		etatRond = new EtatRond(this);
		etatVide = new EtatVide(this);
		
		etatCourants = new ArrayList<>();
		
		//s'abonne a toutes les cases (observer)
		for (PresentationCase pCase : presentationCases) {
			pCase.addObserver(this);
			
			//on rempli la liste des 9 états courants correspondant a l'état courant de chaque case
			etatCourants.add(etatVide);
		}
	}
	
	
	@Override
	public void notifyClick(PresentationCase pCase) {
		//pCase.set
		try {
			etatCourants.get(pCase.getNum()).click(pCase.getNum());
			pCase.setCroix();
		}catch(TransitionException ex) {
			//ex.printStackTrace();
		}
	}



	public void setListePresCase(List<PresentationCase> pc) {
		presentationCases = pc;
	}



	@Override
	public void setEtatCourant(IEtatPlateau etat, int i) {
		etatCourants.set(i, etat);
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
