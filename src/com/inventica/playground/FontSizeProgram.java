package com.inventica.playground;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSizeProgram extends JFrame {
    private int fontSize = 18;
    private JButton b1, b2;
    private JLabel l = new JLabel ("X");
    private JLabel l2 = new JLabel (String.valueOf (fontSize));
    private JPanel p = new JPanel ();

    public JPanel fontSizeProgram ()
    {
        l.setFont (new Font ("Serif", Font.BOLD, fontSize));
        //p.setLayout (new GridLayout (0, 2));
        p.add (l);
        //p.add (l2);

        b1 = new JButton ("increase");
        b1.setFont (new Font ("Serif", Font.ITALIC, 18));
        b1.setBackground (Color.white);
        b1.setOpaque (true);
        b1.setSize(3,2);
        b1.setAlignmentX(0);
        //b1.setPreferredSize (new Dimension (1, 1));
        p.add (b1);

        b2 = new JButton ("decrease");
        b2.setFont (new Font ("Serif", Font.ITALIC, 18));
        b2.setBackground (Color.white);
        b2.setOpaque (true);
        //b2.setPreferredSize (new Dimension (1, 1));
        p.add (b2);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fontSize++;
                l.setFont (new Font ("Serif", Font.BOLD, fontSize));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fontSize--;
                l.setFont (new Font ("Serif", Font.BOLD, fontSize));
            }
        });

        return p;
    }

}
