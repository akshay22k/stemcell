import java.util.ArrayList;

public class Cell {
    public int strength, x, y, id; //get and set

    public Cell(int strength, int x, int y, int id){
        this.strength = strength;
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public Cell(){
        this(0,0,0,0);
    }

    public void interactNeighbours(ArrayList<Cell> neighbours){

    }
}
