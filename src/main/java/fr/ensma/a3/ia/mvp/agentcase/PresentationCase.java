package fr.ensma.a3.ia.mvp.agentcase;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mvp.agentcase.etats.EtatCaseDisable;
import fr.ensma.a3.ia.mvp.agentcase.etats.EtatCaseEnable;
import fr.ensma.a3.ia.mvp.agentcase.etats.IAutomateCase;
import fr.ensma.a3.ia.mvp.agentcase.etats.IEtatCase;

public class PresentationCase implements IAutomateCase{
	
	private int num; // numéro permettant d'identifier la case dans la liste des etats courant de la présentation plateau
	
	private IMediateurCase vueCase;
	
	private IEtatCase etatCourant;
	private IEtatCase etatEnable;
	private IEtatCase etatDisable;
	//Observer
	private List<ICaseObserver> abonnes;
	
	public int getNum() {
		return num;
	}
	

	
	public PresentationCase(VueCase vc, int i) {
		vueCase = vc;
		num = i;
		
		abonnes = new ArrayList<>();
		
		etatEnable = new EtatCaseEnable(this);
		etatDisable = new EtatCaseDisable(this);
		etatCourant = etatEnable;
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
	
	
	
	public void clickButton() {
		notifyObsClick();
	}

	
	public void addObserver(ICaseObserver obs) {
		abonnes.add(obs);
	}
	public void removeObserver(ICaseObserver obs) {
		abonnes.remove(obs);
	}
	
	public void notifyObsClick() {
		for (ICaseObserver abo : abonnes) {
			abo.notifyClick(this);
		}
	}



	
}
