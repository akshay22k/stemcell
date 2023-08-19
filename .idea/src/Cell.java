import java.util.ArrayList;

public class Cell {
    public int strength, x, y, id;

    public Cell(int strength, int x, int y, int id){
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    //getters and setters follow
    public void setStrength(int strength){
        if(strength > 0){
            this.strength =  strength;
        }
        else{
            strength = 0;
        }
    }
    public void setX(int x){
        if(x > 0){
            this.x =  x;
        }
        else{
            x = 0;
        }
    }
    public void setY(int y){
        if(y > 0){
            this.y =  y;
        }
        else{
            y = 0;
        }
    }
    public void setId(int id){
        if(id > 0){
            this.id =  id;
        }
        else{
            id = 0;
        }
    }
    //save for later
    public void interactNeighbours(ArrayList<Cell> neighbours){

    }

    public static void main(String[] args) {
        Cell defaultCell = new Cell(0,0,0,0);
    }


}
