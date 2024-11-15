package shape;
import color.colors;

public class triangle extends shape {

    private point pointA = new point();
    private point pointB = new point();
    private point pointC = new point();

    private void validate(point pointA, point pointB, point pointC) throws Exception {
        double square = Math.abs(
                pointA.getX() * (pointB.getY() - pointC.getY()) +
                        pointB.getX() * (pointC.getY() - pointA.getY()) +
                        pointC.getX() * (pointA.getY() - pointB.getY())
        ) / 2.0;

        if (square == 0) {
            throw new java.lang.Exception("Точки не должны располагаться на одной прямой");
        }
    }

    public triangle(point point1, point point2, point point3, colors Color) throws Exception {
        this.pointA = point1;
        this.pointB = point2;
        this.pointC = point3;
        validate(pointA, pointB, pointC);
        setColor(Color);
    }

    public triangle(point point1, point point2, point point3) throws Exception {
        this.pointA = point1;
        this.pointB = point2;
        this.pointC = point3;
        validate(pointA, pointB, pointC);
    }

    public void setPointA(point point) {
        pointA = point;
    }

    public point getPointA() {
        return pointA;
    }

    public void setPointB(point point) {
        pointB = point;
    }

    public point getPointB() {
        return pointB;
    }

    public void setPointC(point point) {
        pointC = point;
    }

    public point getPointC() {
        return pointC;
    }

    public void move(double x, double y) {
        pointA.move(x, y);
        pointB.move(x, y);
        pointC.move(x, y);
    }

    public double getSquare() {
        double dist1 = point.distance(pointA, pointB);
        double dist2 = point.distance(pointA, pointC);
        double dist3 = point.distance(pointB, pointC);
        double p = (dist1 + dist2 + dist3) / 2;
        return Math.sqrt(p * (p - dist1) * (p - dist2) * (p - dist3));
    }

    public double getPerimeter() {
        double dist1 = point.distance(pointA, pointB);
        double dist2 = point.distance(pointA, pointC);
        double dist3 = point.distance(pointB, pointC);
        return dist1 + dist2 + dist3;
    }

    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Вершины треугольника: ");
        System.out.println("A(" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("B(" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("C(" + pointC.getX() + ", " + pointC.getY() + ")");
        System.out.println("Площадь Треугольника: " + this.getSquare());
        System.out.println("Периметр Треугольника: " + this.getPerimeter());
        System.out.println("Цвет Треугольника: " + getColor());
    }
}
