package shape;
import color.colors;

public class point extends shape {

    private double X;
    private double Y;

    public point(){
        X = 0.0;
        Y = 0.0;
    }

    public point(double x, double y, colors Color){
        this.X = x;
        this.Y = y;
        setColor(Color);
    }

    public point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public void setX(double X){
        this.X = X;
    }

    public void setY(double Y){
        this.Y = Y;
    }

    public static double distance(point point1, point point2){
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }
    @Override
    public void move(double X, double Y) {
        this.X += X;
        this.Y += Y;
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public void draw() {
        System.out.println("Фигура: Точка");
        System.out.println("Координаты точки: (" + X + ", " + Y + ")");
        System.out.println("Цвет точки: " + getColor());
    }

}
