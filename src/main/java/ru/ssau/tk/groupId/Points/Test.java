package ru.ssau.tk.groupId.Points;
import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        DrawFrame frame = new DrawFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("Xn+1 = rXn(1-Xn)");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        add(new DrawPanel());
    }

    public static final int DEFAULT_WIDTH = 1200;
    public static final int DEFAULT_HEIGHT = 780;
}

class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double shX = 100;
        double shY = 50;
        double r = 2;
        for (int x = 1; x < 100000000; ++x)
            g2.draw
                    (
                            new Line2D.Double
                                    (x + shX, DrawFrame.DEFAULT_HEIGHT - (r * (x - 1) - 1 + shY), x + 1 + shX,
                                            DrawFrame.DEFAULT_HEIGHT - (r * (x - 1) - 2 + shY) + shY)
                    );
    }
}
