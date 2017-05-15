/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_project1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @AhmedMuoawad
 */
public class ShowElipse extends JPanel {

    private int xc, yc, rx, ry;

    public ShowElipse() {
        setSize(608, 502);
        setVisible(true);
    }

    public void paintellipse(int xcenter, int ycenter, int Rx, int Ry) {
        this.xc = xcenter;
        this.yc = ycenter;

        this.rx = Rx;
        this.ry = Ry;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        float rxSq = rx * rx;
        float rySq = ry * ry;
        int x = 0, y = ry;
        float px = 0,p;
        float py = 2 * rxSq * y;
        g.setColor(Color.red);
        g.drawLine(xc + x, yc + y, xc + x, yc + y);
        g.setColor(Color.red);
        g.drawLine(xc - x, yc + y, xc - x, yc + y);
                g.setColor(Color.red);

        g.drawLine(xc - x, yc - y, xc - x, yc - y);
         g.setColor(Color.red);
        g.drawLine(xc + x, yc - y, xc + x, yc - y);

        //Region 1
        p = (int) (rySq - (rxSq * ry) + (0.25 * rxSq));
        while (px < py) {
            x++;
            px = px + 2 * rySq;
            if (p < 0) {
                p = p + rySq + px;
            } else {
                y--;
                py = py - 2 * rxSq;
                p = p + rySq + px - py;
            }
            g.drawLine(xc + x, yc + y, xc + x, yc + y);
            g.drawLine(xc - x, yc + y, xc - x, yc + y);
            g.drawLine(xc - x, yc - y, xc - x, yc - y);
            g.drawLine(xc + x, yc - y, xc + x, yc - y);

        }
       //Region 2
        p = (int) (rySq * (x + 0.5) * (x + 0.5) + rxSq * (y - 1) * (y - 1) - rxSq * rySq);
        while (y > 0) {
            y--;
            py = py - 2 * rxSq;
            if (p > 0) {
                p = p + rxSq - py;
            } else {
                x++;
                px = px + 2 * rySq;
                p = p + rxSq - py + px;
            }
            g.setColor(Color.red);
            g.drawLine(xc + x, yc + y, xc + x, yc + y);
            g.drawLine(xc - x, yc + y, xc - x, yc + y);
            g.drawLine(xc - x, yc - y, xc - x, yc - y);
            g.drawLine(xc + x, yc - y, xc + x, yc - y);


        }

    }

}
