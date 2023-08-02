public class Cell {
    public int strength, x, y, id; //get and set

    public Cell(int strength, int x, int y, int id){
        this.strength = 0;
        this.x = 0;
        this.y = 0;
        this.id = 0;
    }
    public Cell(){
        this(0,0,3,1);
    }
}
