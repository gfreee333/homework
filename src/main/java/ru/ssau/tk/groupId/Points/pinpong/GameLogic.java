package ru.ssau.tk.groupId.Points.pinpong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameLogic extends JPanel implements ActionListener, KeyListener {
    private final int Bit1Y = 160;
    private final int Bit2Y = 160;
    private final int BallX = 390;
    private final int BallY = 190;

    GameLogic() {
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 500);
        g.setColor(Color.white);
        g.fillRect(0, Bit1Y, 10, 100);
        g.setColor(Color.white);
        g.fillRect(770, Bit2Y, 10, 100);
        g.fillRect(BallX, BallY, 20, 20);
        g.setColor(Color.white);
        g.drawLine(400, 0, 400, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}