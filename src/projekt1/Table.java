package projekt1;
/**
 * this is a  class modeling the table
 */
public class Table {
    private final int height;
    protected  int width;

    /**
     * CReates a new table
     * @param height height of the table
     * @param width ffvfvvfv f
     */
    public Table(int height, int width) {
        this.height = height;
        this.width = width;
    }
    int howMuchPaint(Paint paint){
        return  calculateArea()/paint.getEfficiency();
    }

    private int calculateArea(){
        return width*height;
    }
}
