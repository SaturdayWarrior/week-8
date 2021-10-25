public class Point {
    private int x;
    private int y;

    //constructors
    public Point() {
        // no-arg generates a MyPoint with origin as its coordinates
        this(0, 0);
    }

    public Point(int x, int y) {
        // generates a MyPoint with coordinates (x,y)
        this.x = x;
        this.y = y;
    }

    // Accessors
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * ((this.y - y)));
    }

    public double distance(Point xy) {
        return Math.sqrt((this.x - xy.x) * (this.x - xy.x) + (this.y - xy.y) * (this.y - xy.y));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
