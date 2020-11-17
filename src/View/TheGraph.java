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


    public void setCords(ArrayList<Point> Cords) {
        this.Cords = Cords;
    }

    public void setTotalCords(int totalCords) {
        this.totalCords = totalCords;
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            try
            {
                TheGraph frame = new TheGraph();
                frame.setVisible(true);


            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


    public TheGraph()
    {
        int domain1, domain2, range1, range2;
        domain1 = -1000;
        domain2 = 1000;
        range1 = -1000;
        range2 = 1000;

        getContentPane().setBackground(new Color(175, 238, 238));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(domain2-domain1, range2-range1);
        setResizable(false);
       // setBounds(100, 100, domain2-domain1, range2-range1);
        getContentPane().setLayout(null);


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

            this.repaint();

    }

@Override
public void paintComponent(Graphics g)
    {
    super.paintComponent(g);

    int xCord = (int) (this.Cordinates.x*100);
        int yCord = (int) (1000-(this.Cordinates.y*100));
        int width = 1;
        int height = nextY-previousY;


        g.fillRect(xCord, yCord, width, height);
    }



}





