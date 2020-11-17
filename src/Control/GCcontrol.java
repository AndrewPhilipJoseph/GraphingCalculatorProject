package Control;

import Model.Seperator;
import View.GraphingCalculatorUI;
import View.TheGraph;

import java.awt.*;
import java.util.ArrayList;




public class GCcontrol {
  GraphingCalculatorUI GCUI;
    ArrayList<Model.Point> Cords = new ArrayList<Model.Point>();

    public GCcontrol()
    {
        this.GCUI = new GraphingCalculatorUI();
        GCUI.setVisible(true);
    }




    public GCcontrol(String input) {
        getPoints(input);
    }

    public void getPoints(String input) {
        int totalCords = 0;
        for (double x = -100; x < 100; x = x + 0.01) {
            double y = 0;

            Seperator mathData = new Seperator(input, x);

            Model.Point nextPoint = new Model.Point(x, mathData);

            Cords.add(nextPoint);
            totalCords++;

        }

      //  new TheGraph(Cords, totalCords);


    }
}

