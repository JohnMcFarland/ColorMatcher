import java.awt.*;
import java.awt.event.*;
import java.util.*;

class RightCanvas extends Canvas implements ActionListener, AdjustmentListener {
	RightCanvas(Scrollbar redRS, Scrollbar greenRS, Scrollbar blueRS, 
				TextField redRT,TextField greenRT, TextField blueRT) {
		
		//Scrollbar
		
		this.redRS = redRS;
		this.greenRS = greenRS;
		this.blueRS = blueRS;
		
		redRS.addAdjustmentListener(this);
		greenRS.addAdjustmentListener(this);
		blueRS.addAdjustmentListener(this);
		
		//Textfield
		this.redRT = redRT;
		this.greenRT = greenRT;
		this.blueRT = blueRT;
		
		setSize(50,100); 
		
	}
	
	public void paint(Graphics g) {
		Color color = new Color(r,gr,b);
		setBackground(color);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if(e.getSource() == redRS){
			r = redRS.getValue();
			redRT.setText(redRS.getValue()+"");
			repaint();
		}	
		else if(e.getSource() == greenRS){
			gr = greenRS.getValue();
			greenRT.setText(greenRS.getValue()+"");
			repaint();
		}	
		else if(e.getSource() == blueRS){
			b = blueRS.getValue();
			blueRT.setText(blueRS.getValue()+"");
			repaint();
		}
		
	}
	
	//Variables
	Scrollbar redRS, greenRS, blueRS;
	
	TextField redRT,greenRT,blueRT;
	
	Color color;
	
	int r = 1, gr = 1,b = 1;
	
	//Button newColor, seeColor;
}


