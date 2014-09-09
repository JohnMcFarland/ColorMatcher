import java.applet.*;
import java.awt.*;

public class colorMatcher extends Applet {
	public void init() {
		
		
		setLayout(new BorderLayout());
		
		Scrollbar redLS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254);
		Scrollbar redRS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254);
		Scrollbar greenLS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254); 
		Scrollbar greenRS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254); 
		Scrollbar blueLS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254); 
		Scrollbar blueRS = new Scrollbar(Scrollbar.VERTICAL, 1,0,0,254);
		
		TextField redLT = new TextField("0");
		redLT.setBackground(Color.RED);
		redLT.setEditable(false);
		TextField redRT = new TextField("0");
		redRT.setEditable(false);
		
		TextField greenLT = new TextField("0");
		greenLT.setBackground(Color.GREEN);
		greenLT.setEditable(false);
		TextField greenRT = new TextField("0");
		greenRT.setEditable(false);
		
		TextField blueLT = new TextField("0");
		blueLT.setBackground(Color.CYAN);
		blueLT.setEditable(false);
		TextField blueRT = new TextField("0");
		blueRT.setEditable(false);
		
		Button newColor = new Button("New Color");
		Button seeColor = new Button("See the Color");
		
		
		Panel canvi = new Panel();
		canvi.setLayout(new GridLayout(0,2));
		
		Panel colorPanel = new Panel();
		Panel redP = new Panel();
		Panel redPT = new Panel();
		Panel redPS = new Panel();
		redP.setLayout(new BorderLayout());
		
		Panel greenP = new Panel();
		Panel greenPT = new Panel();
		Panel greenPS = new Panel();
		greenP.setLayout(new BorderLayout());
		
		Panel blueP = new Panel();
		Panel bluePT = new Panel();
		Panel bluePS = new Panel();
		blueP.setLayout(new BorderLayout());
		
		Panel buttonPanel = new Panel();
		
		
		
		LeftCanvas leftCanvas = new LeftCanvas(redLS,greenLS,blueLS,redLT, greenLT, blueLT,
												newColor, seeColor);
		
		RightCanvas rightCanvas = new RightCanvas(redRS, greenRS, blueRS, redRT, greenRT, blueRT);
		
		
		canvi.add(leftCanvas);
		canvi.add(rightCanvas);
		add(canvi, BorderLayout.WEST);
		
		redPT.add(redLT);
		redPT.add(redRT);
		redPS.add(redLS);
		redPS.add(redRS);
		redP.add(redPT, BorderLayout.NORTH);
		redP.add(redPS, BorderLayout.CENTER);
		colorPanel.add(redP);
		
		greenPT.add(greenLT);
		greenPT.add(greenRT);
		greenPS.add(greenLS);
		greenPS.add(greenRS);
		greenP.add(greenPT,BorderLayout.NORTH);
		greenP.add(greenPS,BorderLayout.CENTER);
		colorPanel.add(greenP);

		bluePT.add(blueLT);
		bluePT.add(blueRT);
		bluePS.add(blueLS);
		bluePS.add(blueRS);
		blueP.add(bluePT, BorderLayout.NORTH);
		blueP.add(bluePS, BorderLayout.CENTER);
		colorPanel.add(blueP);
		
		add(colorPanel, BorderLayout.CENTER);
		
		buttonPanel.add(newColor);
		buttonPanel.add(seeColor);
		add(buttonPanel, BorderLayout.SOUTH);
		
	}
	
	
}