package Model;

import java.util.ArrayList;

public class CordStore {

    private ArrayList<Model.Point> Cords = new ArrayList<Model.Point>();
    private int totalCords;



    public void setCords(ArrayList<Point> Cords) {
        this.Cords = Cords;
    }

    public void setTotalCords(int totalCords) {
        this.totalCords = totalCords;
    }



}
