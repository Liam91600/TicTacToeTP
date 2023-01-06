package fr.ensma.a3.ia.mvp.agentcase;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

public class VueCase extends Pane implements EventHandler<MouseEvent>, IMediateurCase{

	private Image croix, rond, vide;
	
	private PresentationCase presentationCase; //pour dire a la presentation "on m'a cliqué dessus -> la présentation bouge son automate"
	
	public VueCase() {
		croix = new Image("/croix.png");
		rond = new Image("/rond.png");
		vide = new Image("/vide.png");
		setImage(croix);
		setPrefSize(110, 110);
		
		addEventHandler(MouseEvent.MOUSE_PRESSED, this);
	}
	
	public void setCroix() {
		 setImage(croix);
	}
	public void setRond() {
		setImage(rond);
	}
	public void setVide() {
		setImage(vide);
	}
	
	public void setImage(Image img) {
		
		Background bg = new Background(
				new BackgroundImage(img,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, BackgroundSize.DEFAULT)
				);
		setBackground(bg);
	}
	
	
	public void setPresentation(PresentationCase cp) {
		presentationCase = cp;
	}
	
	@Override
	public void handle(MouseEvent event) {
		System.out.println("test!!!!");
		setImage(rond);
	}

	
	
	
}
