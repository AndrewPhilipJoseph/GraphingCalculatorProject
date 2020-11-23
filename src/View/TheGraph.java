package View;

import Model.Point;
import View.GraphingCalculatorUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TheGraph extends JFrame
{


    int iterator = 5;

    static int testvalue = 40;

    ArrayList<Point> Cords;

    public JTextField SleepBar = new JTextField();

    public void setCords(ArrayList<Point> Cords) {
        this.Cords = Cords;
    }




public TheGraph()
{
    int domain1, domain2, range1, range2;
    domain1 = -250;
    domain2 = 250;
    range1 = -250;
    range2 = 250;

    getContentPane().setBackground(new Color(255, 255, 255));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(domain2-domain1, range2-range1);
    //Graph.setResizable(false);
    getContentPane().setLayout(null);
    // setBounds(100, 100, domain2-domain1, range2-range1);
}


    @Override
    public void paint(Graphics g)
    {
        //super.paint(g);

        GraphingCalculatorUI.JBar.setText(String.valueOf(testvalue));
        Graphics2D gui = (Graphics2D) g;

Rectangle rect = new Rectangle(testvalue, 50, 10, 10);
        gui.fill(rect);
        g.setColor(Color.black);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testvalue=testvalue+10;

        repaint();
    }




    public TheGraph(ArrayList<Integer> xCords,  ArrayList<Integer> yCords, int width, ArrayList<Integer> height, int totalCords) throws InterruptedException {

        grapher();


    }

    public static void grapher() throws InterruptedException {

        TheGraph Graph = new TheGraph();
        Graph.setVisible(true);


            testvalue = testvalue + 40;
            Graph.repaint();
            // SleepBar.setText(String.valueOf(i));



    }






}


