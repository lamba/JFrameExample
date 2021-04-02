package com.inventica.playground;

import javax.swing.*;
import com.inventica.playground.FontSizeProgram;

import java.awt.*;
import javax.swing.ImageIcon;

public class JFrameExample extends JFrame {
    public static void main (String[]args)
    {

        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(300, 200);
        //frame.setTitle ("Font Size");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FontSizeProgram fps = new FontSizeProgram();
        frame.getContentPane().setBackground(new Color(100,100,100));
        JPanel panel = fps.fontSizeProgram();
        ImageIcon ii = new ImageIcon("dummy-logo.png");
        frame.setIconImage(ii.getImage()); //doesn't work on mac
        frame.add(panel, BorderLayout.SOUTH);
        frame.repaint();
        frame.setVisible(true);
    }

}
