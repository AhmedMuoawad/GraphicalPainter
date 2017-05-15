package Graph_project1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class drawing extends JPanel {

    private float x1, y1, x2, y2;
    

    public drawing() {
        setSize(1000, 1000);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
        
    }

    public void paintline(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
       
        repaint();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawLine(364, 0, 364,586);
        g.drawLine(0, 293, 728, 293);
        float dx = x2 - x1;
        float dy = y2 - y1;
        float m = dy / dx;
        if (m < 1) {
            for (int i = (int) x1; i <= x2; i++, y1 += m) {
                g.drawLine(i, Math.round(y1), i, Math.round(y1));
            }
        } else {
            for (int i = (int) y1; i <= y2; i++, x1 += (1 / m)) {
                g.drawLine(Math.round(x1), i, Math.round(x1), i);
            }
        }
    }
    
}
