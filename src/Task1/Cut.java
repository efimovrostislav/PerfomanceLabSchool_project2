package Task1;

public class Cut {
    private double coordinateX1;
    private double coordinateX2;
    private double coordinateY1;
    private double coordinateY2;
    private double epsilon = 0.0001;

    public Cut(double coordinateX1, double coordinateX2, double coordinateY1, double coordinateY2) {
        if(coordinateX1 == coordinateX2 && coordinateY1 == coordinateY2){
            System.out.println("Измените данные, точки совпадают");
        }
        this.coordinateX1 = coordinateX1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY1 = coordinateY1;
        this.coordinateY2 = coordinateY2;
    }
    public boolean isEqual(Cut cut) {
        return Math.abs(this.cutLength() - cut.cutLength()) < epsilon;
    }

    private double cutLength() {
        double lengthX = Math.abs(coordinateX1 - coordinateX2);
        double lengthY = Math.abs(coordinateY1 - coordinateY2);

        return Math.cbrt(lengthX*lengthX + lengthY*lengthY);

    }
}
