package shape;
import color.colors;

public abstract class shape {

    private colors Color = colors.TRANSPARENT;

    public colors getColor(){
        return Color;
    }

    public void setColor(colors Color){
        this.Color = Color;
    }

    public abstract void move(double x, double y);
    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract void draw();


}
