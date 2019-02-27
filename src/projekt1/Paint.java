package projekt1;

public class Paint {
    private int efficiency;

    public Paint(int efficiency) {
        this.efficiency = efficiency;
    }

    int getEfficiency(){
       return efficiency*3;
    }
}
