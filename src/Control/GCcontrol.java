package Control;

import Model.FnStorer;
import Model.Seperator;
import View.GraphingCalculatorUI;
import View.TheGraph;

import javax.swing.*;
import java.util.ArrayList;




public class GCcontrol {


    ArrayList<Model.Point> Cords = new ArrayList<Model.Point>();

  GraphingCalculatorUI GCUI;
  Model.Point model;


  FnStorer functions;


    public GCcontrol()
    {

        this.model = new Model.Point();

        this.GCUI = new GraphingCalculatorUI();
        GCUI.setVisible(true);


    }



    public GCcontrol(String input) throws InterruptedException {
        getPoints(input);
    }



    public void getPoints(String input) throws InterruptedException {



        int totalCords = 0;
        for (double x = -100; x < 100; x = x + 1) {
            double y = 0;


            Seperator mathData = new Seperator(input, x);


            Model.Point nextPoint = new Model.Point(x, mathData);

            Cords.add(nextPoint);
            totalCords++;

        }





      //  new TheGraph(Cords, totalCords);


    }
}



