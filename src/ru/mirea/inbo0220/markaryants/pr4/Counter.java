package ru.mirea.inbo0220.markaryants.pr4;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Counter extends JFrame
{
    JButton command1 = new JButton("AC Milan");
    JButton command2 = new JButton("Real Madrid");
    int c1 = 0;
    int c2 = 0;
    JLabel result = new JLabel("Result: " + c1 + " X " + c2);
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    Counter()
    {
        super("Counter");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(command1);
        add(command2);
        add(result);
        add(lastScorer);
        add(winner);
        command1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                c1++;
                result.setText("Result: " + c1 + " X " + c2);
                lastScorer.setText("Last Scorer: AC Milan");
                if (c1 > c2){
                    winner.setText("Winner: AC Milan");
                } else if (c1 < c2) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        command2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                c2++;
                result.setText("Result: " + c1 + " X " + c2);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (c1 > c2){
                    winner.setText("Winner: AC Milan");
                } else if (c1 < c2) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Counter();
    }
}


