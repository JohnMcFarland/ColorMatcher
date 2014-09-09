import java.awt.*;
import java.awt.event.*;
import java.util.*;

class LeftCanvas extends Canvas implements ActionListener, AdjustmentListener {
	LeftCanvas(Scrollbar redLS, Scrollbar greenLS, Scrollbar blueLS, 
			   TextField redLT, TextField greenLT,TextField blueLT,
			   Button newColor, Button seeColor) {
		
		//Scrollbar
		this.redLS = redLS;
		this.greenLS = greenLS;
		this.blueLS = blueLS;
		
		//redLS.addAdjustmentListener(this);
		//greenLS.addAdjustmentListener(this);
		//blueLS.addAdjustmentListener(this);
		
		
		//Textfield
		this.redLT = redLT;
		this.greenLT = greenLT;
		this.blueLT = blueLT;
		
		
		
		//Buttons
		this.newColor = newColor;
		this.seeColor = seeColor;
		
		seeColor.addActionListener(this);
		newColor.addActionListener(this);

		//Color color = new Color(r,g,b);
		
		setSize(50,100); 
		
	}
	
	public void paint(Graphics g) {
		Color color = new Color(r,gr,b);
		setBackground(color);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == seeColor){
			redLT.setText(color.getRed()+"");
			greenLT.setText(color.getGreen()+"");
			blueLT.setText(color.getBlue()+"");
		}
		else if(e.getSource() == newColor){
			Random rand = new Random();
			r = rand.nextInt(254);
			gr = rand.nextInt(254);
			b = rand.nextInt(254);
			color = new Color(r,gr,b);
			redLT.setText("");
			greenLT.setText("");
			blueLT.setText("");
		}
		repaint();
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
	}
	
	//Variables
	Scrollbar redLS,greenLS,blueLS;
	
	TextField redLT,greenLT,blueLT; 
	
	Button newColor, seeColor;
	
	Color color;
	
	int r = 155, gr = 155,b = 1;
}


