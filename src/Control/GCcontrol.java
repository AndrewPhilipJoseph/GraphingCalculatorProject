package Control;

import Model.CordStore;
import Model.FnStorer;
import Model.Point;
import Model.Seperator;
import View.GraphingCalculatorUI;
import View.TheGraph;

import javax.swing.*;
import java.util.ArrayList;




public class GCcontrol {


    ArrayList<Model.Point> Cords = new ArrayList<Model.Point>();

  GraphingCalculatorUI GCUI;
  Model.Point model;
  CordStore CordStuffs;

  FnStorer functions;
  TheGraph Graph;



    public GCcontrol()
    {

        this.model = new Model.Point();

        this.CordStuffs = new CordStore();


        this.GCUI = new GraphingCalculatorUI(this);

        GCUI.setVisible(true);




    }



    public GCcontrol(String input) throws InterruptedException {
        getPoints(input);
    }



    public void getPoints(String input) throws InterruptedException {
        int totalCords = -1;

        ArrayList<Integer> xCords = new ArrayList<>();
        ArrayList<Integer> yCords = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();

        for (double x = -100; x <= 100; x = x + 1) {
            double y = 0;




            Seperator mathData = new Seperator(input, x);


            Model.Point nextPoint = new Model.Point(x, mathData);

            Cords.add(nextPoint);

            totalCords++;

            if (x == 100) {
                Model.Point testPoint = Cords.get(totalCords);
                //GCUI.JBar.setText(String.valueOf(testPoint.y));
            }


        }
        CordStuffs.setCords(Cords);
        CordStuffs.setTotalCords(totalCords);

        for (int n = 0; n < totalCords; n++)
        {
            CordStuffs.setCurrentCordinate(n);

            xCords.add(CordStuffs.calculateX());
            yCords.add(CordStuffs.calculateY());
            int width = 1;
            height.add(CordStuffs.calculateHeight(n));

           //GCUI.JBar.setText(String.valueOf(height));
        }

        Graph = new TheGraph(xCords, yCords, 1, height, totalCords);







      //  new TheGraph(Cords, totalCords);


    }
}



