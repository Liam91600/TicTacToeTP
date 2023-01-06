package fr.ensma.a3.ia.mvp.agentcase;

import java.util.List;

import fr.ensma.a3.ia.mvp.agentcase.etats.IAutomateCase;
import fr.ensma.a3.ia.mvp.agentcase.etats.IEtatCase;

public class PresentationCase implements IAutomateCase{
	
	private IMediateurCase vueCase;
	
	private IEtatCase etatCourant;
	private IEtatCase etatEnable;
	private IEtatCase etatDisable;
	

	
	public PresentationCase(VueCase vc) {
		vueCase = vc;
	}

	//Observer
	private List<ICaseObserver> abonnes;
	
	
	public void notifyObsClick() {
		for (ICaseObserver abo : abonnes) {
			abo.notifyClick();
		}
	}
	
	public void setCroix() {
		vueCase.setCroix();
	}
	public void setRond() {
		vueCase.setRond();
	}
	public void setVide() {
		vueCase.setVide();
	}

	@Override
	public void setEtatCourant(IEtatCase etat) {
		etatCourant = etat;
	}
	@Override
	public IEtatCase getEtatEnable() {
		return etatEnable;
	}
	@Override
	public IEtatCase getEtatDisable() {
		return etatDisable;
	}
	
	
	
	
	
		
}
