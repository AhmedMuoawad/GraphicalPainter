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
 * @author THE AhmedMuoawad
 */
public class ShowCircle extends JPanel {

    private int xcenter, ycenter, r, x, y, p;

    public ShowCircle() {
        setSize(608, 502);
        setVisible(true);
        //setBackground(Color.ORANGE);
    }

    public void paintcircle(int xcenter, int ycenter, int r) {
        this.xcenter = xcenter;
        this.ycenter = ycenter;

        this.r = r;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        x = 0;
        y = r;
        g.drawLine(xcenter + x, ycenter + y, xcenter + x, ycenter + y);
        g.drawLine(xcenter - x, ycenter + y, xcenter - x, ycenter + y);
        g.drawLine(xcenter - x, ycenter - y, xcenter - x, ycenter - y);
        g.drawLine(xcenter + x, ycenter - y, xcenter + x, ycenter - y);
        g.drawLine(xcenter + y, ycenter + x, xcenter + y, ycenter + x);
        g.drawLine(xcenter - y, ycenter + x, xcenter - y, ycenter + x);
        g.drawLine(xcenter - y, ycenter - x, xcenter - y, ycenter - x);
        g.drawLine(xcenter + y, ycenter - x, xcenter + y, ycenter - x);

        p = 1 - r;
        while (x < y) {
            x++;
            if (p < 0) {
                p += 2 * x + 1;
            } else {
                y--;
                p += 2 * (x - y) + 1;
            }
            g.drawLine(xcenter + x, ycenter + y, xcenter + x, ycenter + y);
            g.drawLine(xcenter - x, ycenter + y, xcenter - x, ycenter + y);
            g.drawLine(xcenter - x, ycenter - y, xcenter - x, ycenter - y);
            g.drawLine(xcenter + x, ycenter - y, xcenter + x, ycenter - y);
            g.drawLine(xcenter + y, ycenter + x, xcenter + y, ycenter + x);
            g.drawLine(xcenter - y, ycenter + x, xcenter - y, ycenter + x);
            g.drawLine(xcenter - y, ycenter - x, xcenter - y, ycenter - x);
            g.drawLine(xcenter + y, ycenter - x, xcenter + y, ycenter - x);

        }

    }

}
