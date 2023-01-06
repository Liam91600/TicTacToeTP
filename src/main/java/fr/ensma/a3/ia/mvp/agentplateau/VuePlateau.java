package fr.ensma.a3.ia.mvp.agentplateau;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;
import fr.ensma.a3.ia.mvp.agentcase.VueCase;
import javafx.geometry.Orientation;
import javafx.scene.layout.TilePane;

public class VuePlateau extends TilePane{
	
	
	private List<VueCase> vueCases;
	private List<PresentationCase> presentationCases;
	
	private PresentationPlateau presentationPlateau;

	public VuePlateau() {
		vueCases = new ArrayList<>();
		presentationCases = new ArrayList<>();
		setOrientation(Orientation.HORIZONTAL);
		
		for (int i=0; i<9; i++) {
			VueCase cv = new VueCase();
			vueCases.add(cv);
			
			PresentationCase cp = new PresentationCase(cv);
			presentationCases.add(cp);
			
			cv.setPresentation(cp);
			
			getChildren().add(cv);
		}
		//vueCases.get(4).setRond(); interdit 
		
	
		}
	
	public void setPresentation(PresentationPlateau pp) {
		presentationPlateau = pp;
		presentationPlateau.setListePresCase(presentationCases);
	}
	

	

}
