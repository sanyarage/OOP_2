package shape;
import color.colors;

public class rectangle extends shape {

    private point pointA = new point();
    private point pointB = new point();

    private void validate(point pointA, point pointB) throws Exception {
        if (pointA.getX() == pointB.getX() || pointA.getY() == pointB.getY()) {
            throw new java.lang.Exception("Неверные координаты точек: точки должны задавать прямоугольник.");
        }
    }

    public void setPointA(point pointA) throws Exception {
        if (this.pointB != null) {
            validate(pointA, this.pointB);
        }
        this.pointA = pointA;
    }

    public point getPointA() {
        return pointA;
    }

    public void setPointB(point pointB) throws Exception {
        if (this.pointA != null) {
            validate(this.pointA, pointB);
        }
        this.pointB = pointB;
    }

    public point getPointB() {
        return pointB;
    }

    public rectangle(point point1, point point2, colors Color) throws Exception {
        this.pointA = point1;
        this.pointB = point2;
        validate(this.pointA, this.pointB);
        setColor(Color);
    }

    public rectangle(point point1, point point2) throws Exception {
        this.pointA = point1;
        this.pointB = point2;
        validate(this.pointA, this.pointB);
    }

    @Override
    public void move(double x, double y) {
        pointA.move(x, y);
        pointB.move(x, y);
    }

    @Override
    public double getSquare() {
        return Math.abs((pointA.getX() - pointB.getX()) * (pointA.getY() - pointB.getY()));
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.abs(pointA.getX() - pointB.getX()) + Math.abs(pointA.getY() - pointB.getY()));
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Противоположные вершины: (" + pointA.getX() + ", " + pointA.getY() + ") и (" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("Площадь: " + this.getSquare() + " кв. ед.");
        System.out.println("Периметр: " + this.getPerimeter() + " ед.");
        System.out.println("Цвет: " + getColor());
    }
}
