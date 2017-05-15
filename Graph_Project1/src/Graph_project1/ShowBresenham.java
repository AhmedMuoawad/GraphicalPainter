
package Graph_project1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ShowBresenham extends JPanel{
     private int x1,y1,x2,y2,dx,dy,pk;
     Component n = null;
    public ShowBresenham() {
        //initComponents();
        setSize(608, 502);
        setVisible(true);
    
}
    public void paintline(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
         dx=x2-x1;
        dy=y2-y1;
        if(dy<dx)
        {
            pk=(2*dy)-dx;
            for(int i=0;i<dx;i++)
            {
                
                if(pk<0)
                {
                    x1++;
                    
                    pk=pk+(2*dy);
                   g.drawLine(x1, y1, x1, y1);
                }
                else 
                {
                   
                    x1++;
                    y1++;
                    pk=pk+(2*dy)-(2*dx);
                    g.drawLine(x1, y1, x1, y1);
                }
            }
        }
        
    }
    
   
    }

