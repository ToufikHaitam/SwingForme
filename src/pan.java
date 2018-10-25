import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class pan extends JPanel {

int x=0,y=0,wi=20,he=30;
boolean t=true;
String type="Cercle";
Timer timer;
String Sens="dr";
private float degrees = 0;
 
	public String getType() {
	return this.type;
}




public void setType(String type) {
	this.type = type;
}




	public pan() {
		
		  timer = new Timer(13, new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	if(Sens=="dr")
		    	degrees+=2f;
		    	if(Sens=="gch")
			    	degrees-=2f;
		       
		    	if(wi>getWidth() ||he>getHeight()) t=false;
		    	if(wi==0||he==0) t=true;	
		    	if(t==true) {
		    	
		    	wi++;
			    he++;}
		    	
		    	if(t==false) {
			    	
			    	wi--;
				    he--;}
		        x =(getWidth()-wi)/2;
		        y=(getHeight()-he)/2;
		       
		        repaint();
		    }
		});
		 timer.start();

	} 
	
	
	
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setColor(Color.BLUE);

        if(type=="Cercle")  g2d.fillOval(x,y,Math.min(wi, he),Math.min(wi, he));    
        else g2d.fillRect(x,y,Math.min(wi, he),Math.min(wi, he)); 
        
        g2d.setColor(Color.RED);
        float innerDiameter = 17;

        Point p = getPointOnCircle(degrees, Math.min(wi, he)/ 2f );
        g2d.fillOval( p.x-x-(int) innerDiameter+4,p.y-y-(int) innerDiameter-5, (int) innerDiameter, (int) innerDiameter);

        g2d.dispose();
	
	
	}
	 protected Point getPointOnCircle(float degress, float radius) {

         int x = Math.round(getWidth()-Math.min(wi, he) / 2);
         int y = Math.round(getHeight()-Math.min(wi, he)/ 2);

         double rads = Math.toRadians(degress - 190); // 0 becomes the top

         // Calculate the outter point of the line
         int xPosy = Math.round((float) (x + Math.cos(rads) * radius));
         int yPosy = Math.round((float) (y + Math.sin(rads) * radius));

         return new Point(xPosy, yPosy);

     }

}
