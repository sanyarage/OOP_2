package service;

import color.colors;
import shape.shape;

import java.util.List;
import java.util.Set;

public interface interfaceShapesService {

    double getSquares(List<shape> shapeList);
    double getMaxPerimeters(List<shape> shapeList);
    Set<colors> getColors(List<shape> shapeList);

}
