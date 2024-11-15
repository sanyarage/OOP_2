package shape;
import shape.point;
import shape.circle;
import color.colors;

import service.impl.ShapesServiceImpl;
import shape.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {

        point point = new point(2, 1);
        circle circle = new circle(point, 1);
        circle.draw();

        circle.setColor(colors.RED);
        circle.setPoint(new point(2, 2));
        circle.move(1, 1);
        circle.draw();

        List<shape> list = new ArrayList<>();
        list.add(new triangle(new point(0, 0), new point(0, 4), new point(4, 0), colors.RED));
        list.add(new circle(new point(3, 3), 2, colors.WHITE));
        list.add(new circle(new point(2, 5), 4, colors.YELLOW));
        list.add(new rectangle(new point(1, 1), new point(5, 2)));
        list.add(new point(100, 100));
        list.add(new triangle(new point(-2, 3), new point(4, 3), new point(2, 5), colors.BLUE));

        ShapesServiceImpl impl = new ShapesServiceImpl();

        System.out.println("Суммарная площадь всех фигур: " + impl.getSquares(list));
        System.out.println("Максимальный периметр всех фигур: " + impl.getMaxPerimeters(list));
        System.out.println("Все цвета фигур: " + impl.getColors(list));

    }
}
