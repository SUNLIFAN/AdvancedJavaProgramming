package S201250181;

public class Matrix {

    //add in 8x8 version

    private int col;
    
    private int row;

    private static int cnt;

    public Matrix(int row,int col) {
        int length = row*col;
        this.row = row;
        this.col = col;
        this.positions = new Position[length];
    }

    private Position[] positions;

    /**
     * 
     * @param linable
     * @param rowNum 行号，从 1 开始
     * @param colNum 列号，从 1 开始
     */
    public void put(Linable linable, int rowNum,int colNum) {
        int i = (rowNum-1)*col + colNum - 1;
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }
    /**
     * 
     * @param rowNum 行号，从 1 开始
     * @param colNum 列号，从 1 开始
     * @return
     */

    public Linable get(int rowNum,int colNum) {
        int i = (rowNum-1)*col+colNum - 1;
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    class Position {

        private Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        //String lineString = "\t";
        String lineString = "";
        for (Position p : positions) {
            cnt++;
            lineString += p.linable.toString();
            if(cnt%col == 0 && cnt != row*col)lineString += "\n";//add in 8x8 version
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }

}
