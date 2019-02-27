package projekt1;

/**
 *
 * dxdx
 * ex
 */
 class ExpandableTable extends Table{
     public ExpandableTable(int height, int width) {
         super(height, width);
     }

    /**
     * expand the widht
     *
     * xxx
     */
     void expand(){
        width*=1.2;
    }
}
