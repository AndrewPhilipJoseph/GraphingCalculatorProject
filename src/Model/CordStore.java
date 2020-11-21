package Model;

import java.util.ArrayList;
/*
public class CordStore {



    private ArrayList<Model.Point> Cords = new ArrayList<Model.Point>();
    private int totalCords;


    private Point Cordinates;

    private int nextY;
    private int previousY;

    private int xCord;
    private int yCord;
    private int width = 1;
    private int height;

    private int xCord = (int) (this.Cordinates.x*100);
    private int yCord = (int) (1000-(this.Cordinates.y*100));
    private int width = 1;
    private int height = nextY-previousY;


    public void setCordinates(Point cordinates) {
        Cordinates = cordinates;
    }

    public void setNextY(int nextY) {
        this.nextY = nextY;
    }

    public void setPreviousY(int previousY) {
        this.previousY = previousY;
    }


    public setxCord(ArrayList<Point> Cords)
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

}

/*
public void setCords(ArrayList<Point> Cords) {
        this.Cords = Cords;
    }

    public void setTotalCords(int totalCords) {
        this.totalCords = totalCords;
    }
 */