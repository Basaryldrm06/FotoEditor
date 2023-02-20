package fotoeditor;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class GuiObjects 
{
    public static JPanel DEFAULT_TOP_PANEL()
    {
        JPanel DEFAULT_TOP_PANEL = new JPanel();
        FlowLayout flowLayer = new FlowLayout();

        DEFAULT_TOP_PANEL.setLayout(new BorderLayout());
        // LEFT PANEL
        {
            JPanel DEFAULT_UPPER_LEFT_PANEL = new JPanel();    
            DEFAULT_UPPER_LEFT_PANEL.setLayout(flowLayer);

            JButton ISIK = new JButton();
            JButton FILTRE = new JButton();
            JButton SEC = new JButton();
            JButton button4 = new JButton();
            JButton button5 = new JButton();
            JButton button6 = new JButton();
                
            JLabel forIsik = new JLabel("IŞIK");
            JLabel forFiltre = new JLabel("FİLTRE");
            JLabel forSec = new JLabel("SEÇ");

            Dimension buttonSize = new Dimension(50,50);
                
            ISIK.setPreferredSize(buttonSize);
            FILTRE.setPreferredSize(buttonSize);
            SEC.setPreferredSize(buttonSize);
            button4.setPreferredSize(buttonSize);
            button5.setPreferredSize(buttonSize);
            button6.setPreferredSize(buttonSize);

            DEFAULT_UPPER_LEFT_PANEL.add(ISIK);
            DEFAULT_UPPER_LEFT_PANEL.add(FILTRE);
            DEFAULT_UPPER_LEFT_PANEL.add(SEC);
            DEFAULT_UPPER_LEFT_PANEL.add(button4);
            DEFAULT_UPPER_LEFT_PANEL.add(button5);
            DEFAULT_UPPER_LEFT_PANEL.add(button6);


            DEFAULT_TOP_PANEL.add(DEFAULT_UPPER_LEFT_PANEL, BorderLayout.LINE_START);
        }

        // CENTRE PANEL
        {
            JPanel DEFAULT_UPPER_CENTRE_PANEL = new JPanel();    
            DEFAULT_UPPER_CENTRE_PANEL.setLayout(flowLayer);

            JButton button1 = new JButton();
            JButton button2 = new JButton();
            JButton button3 = new JButton();
            JButton button4 = new JButton();
            JButton button5 = new JButton();
            JButton button6 = new JButton();
                
            Dimension buttonSize = new Dimension(50,50);
                
            button1.setPreferredSize(buttonSize);
            button2.setPreferredSize(buttonSize);
            button3.setPreferredSize(buttonSize);
            button4.setPreferredSize(buttonSize);
            button5.setPreferredSize(buttonSize);
            button6.setPreferredSize(buttonSize);

            DEFAULT_UPPER_CENTRE_PANEL.add(button1);
            DEFAULT_UPPER_CENTRE_PANEL.add(button2);
            DEFAULT_UPPER_CENTRE_PANEL.add(button3);
            DEFAULT_UPPER_CENTRE_PANEL.add(button4);
            DEFAULT_UPPER_CENTRE_PANEL.add(button5);
            DEFAULT_UPPER_CENTRE_PANEL.add(button6);


            DEFAULT_TOP_PANEL.add(DEFAULT_UPPER_CENTRE_PANEL, BorderLayout.CENTER);
        }

        // RIGHT PANEL
        {
            JPanel DEFAULT_UPPER_RIGHT_PANEL = new JPanel();    
            DEFAULT_UPPER_RIGHT_PANEL.setLayout(flowLayer);

            JButton button1 = new JButton();
            JButton button2 = new JButton();
            JButton button3 = new JButton();
            JButton button4 = new JButton();
            JButton button5 = new JButton();
            JButton button6 = new JButton();
                
            Dimension buttonSize = new Dimension(50,50);
                
            button1.setPreferredSize(buttonSize);
            button2.setPreferredSize(buttonSize);
            button3.setPreferredSize(buttonSize);
            button4.setPreferredSize(buttonSize);
            button5.setPreferredSize(buttonSize);
            button6.setPreferredSize(buttonSize);

            DEFAULT_UPPER_RIGHT_PANEL.add(button1);
            DEFAULT_UPPER_RIGHT_PANEL.add(button2);
            DEFAULT_UPPER_RIGHT_PANEL.add(button3);
            DEFAULT_UPPER_RIGHT_PANEL.add(button4);
            DEFAULT_UPPER_RIGHT_PANEL.add(button5);
            DEFAULT_UPPER_RIGHT_PANEL.add(button6);


            DEFAULT_TOP_PANEL.add(DEFAULT_UPPER_RIGHT_PANEL, BorderLayout.LINE_END);
        }

        return DEFAULT_TOP_PANEL;
    }
}
