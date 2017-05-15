/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_project1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author AhmedMuoawad
 */
public class rotate extends JPanel {
    
    
    private float x1, y1, x2, y2;
    public rotate() {
        setSize(2000, 1000);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
        
    }
    public void rotate(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
       
        repaint();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponents(g);
      
     
        g.setColor(Color.RED);
        
        g.drawLine((int)x1, (int)y1, (int)x2, (int) y2);
      
    }
    
}
