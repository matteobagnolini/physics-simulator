package ProjectileMotion;

import java.awt.*;			// graphics and GUI classes
import java.awt.event.*;	// handles button and window events
import java.util.*;			// needed for Date and Properties
import javax.swing.*;

import Graphics.Plot;

public class GUI {

    private double speed;
    private double angle;
    private double h;

    private boolean canLaunch = false;

    private Projectile pr;
    private Plot myPlot;
    private JFrame frame = new JFrame("Launch window");
    
    public GUI() {
        final JPanel canvas = new JPanel();
        final JPanel panel1 = new JPanel();
        final JPanel panel2 = new JPanel();
        final JPanel panel3 = new JPanel();
        final JPanel btnPanel = new JPanel(new FlowLayout());
        final JPanel mainPanel = new JPanel(new BorderLayout());
        canvas.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblAngle = new JLabel("Write the angle of launch");
        JLabel lblSpeed = new JLabel("Write the speed of the launch");
        JLabel lblH = new JLabel("Write the height of the launch");

        final JTextField txtangle = new JTextField(2);
        final JTextField txtspeed = new JTextField(2);
        final JTextField txth = new JTextField(2);
        final JButton confirm = new JButton("Done");
        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                angle = Double.parseDouble(txtangle.getText());
                speed = Double.parseDouble(txtspeed.getText());
                h = Double.parseDouble(txth.getText());
                //launchGUI();
                canLaunch = true;
            }
        }
        );

        btnPanel.add(confirm);
        

        panel1.add(lblAngle);
        panel1.add(txtangle);
        panel2.add(lblSpeed);
        panel2.add(txtspeed);
        panel3.add(lblH);
        panel3.add(txth);

        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.CENTER);
        mainPanel.add(panel3, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel, BorderLayout.NORTH);
        frame.getContentPane().add(btnPanel, BorderLayout.CENTER);

        display();


    }

    public void launchGUI() throws InterruptedException  {    
        while(!canLaunch) {
            Thread.sleep(1000);
        }
        this.pr = new Projectile2D(angle, speed, h, 0);
        System.out.println("Created new projectile: " + pr);
        this.myPlot = new Plot("x vs y", -1, 50, 5, -1, 50, 5);
        drawPlot();
    }

    private void drawPlot()  {
        pr.computeMotion();
        for(var point : pr.getMotion().entrySet()) {
            myPlot.addPoint(point.getKey(), point.getValue());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myPlot.clearThePlot();
        }
    }

    private void display() {
        final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        final int sw = (int) screen.getWidth();
        final int sh = (int) screen.getHeight();
        frame.setSize(sw / 5, sh / 5);
        /*
         * Instead of appearing at (0,0), upper left corner of the screen, this
         * flag makes the OS window manager take care of the default positioning
         * on screen. Results may vary, but it is generally the best choice.
         */
        frame.setLocationByPlatform(true);
        /*
         * OK, ready to pull the frame onscreen
         */
        frame.setVisible(true);
    }

}
