package View;

import Model.Point;
import View.GraphingCalculatorUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TheGraph extends JFrame
{

    ArrayList<Point> Cords;
    int totalCords;

    public JTextField SleepBar = new JTextField();

    public void setCords(ArrayList<Point> Cords) {
        this.Cords = Cords;
    }

    public void setTotalCords(int totalCords) {
        this.totalCords = totalCords;
    }




    public TheGraph() throws InterruptedException
    {

        JFrame Graph = new JFrame();

        int domain1, domain2, range1, range2;
        domain1 = -100;
        domain2 = 100;
        range1 = -100;
        range2 = 100;

        Graph.getContentPane().setBackground(new Color(175, 238, 238));
        Graph.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Graph.setSize(domain2-domain1, range2-range1);
        Graph.setResizable(false);
       // setBounds(100, 100, domain2-domain1, range2-range1);
        Graph.getContentPane().setLayout(null);

        for (int i = 0; i < totalCords; i++)
        {
            Thread.sleep(10);
            SleepBar.setText(String.valueOf(i));

            GraphingCalculatorUI.JBar.setText(String.valueOf(5));


            Graph.add(new drawRect(Cords, i));


            Graph.repaint();

        }


    }


}




class drawRect extends JPanel {

    private Point Cordinates;

    private int nextY;
    private int previousY;

    public drawRect(ArrayList<Point> Cords, int n)
    {

        this.Cordinates = Cords.get(n);


        try
        {
            this.nextY = (int) Cords.get(n + 1).y;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.nextY = 0;
        }

        try
        {
            this.previousY = (int) Cords.get(n - 1).y;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.previousY = 0;
        }



    }

    @Override
    public void paint(Graphics g)
    {

        super.paintComponent(g);


        int xCord = (int) (this.Cordinates.x);
        int yCord = (int) (100-(this.Cordinates.y));
        int width = 1;
        int height = nextY-previousY;

        //g.fillRect(xCord, yCord, width, height);
        g.fillRect(50, 50, 50, 50);
    }



}










