package service.impl;

import color.colors;
import shape.shape;
import service.interfaceShapesService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements interfaceShapesService {
    @Override
    public double getSquares(List<shape> shapeList){
        double sum = 0;
        for(shape shape : shapeList){
            sum += shape.getSquare();
        }
        return sum;
    }

    @Override
    public double getMaxPerimeters(List<shape> shapeList){
        double maxPerimeter = -1;

        for(shape shape : shapeList){
            maxPerimeter = Math.max(maxPerimeter, shape.getPerimeter());
        }

        return maxPerimeter;
    }

    @Override
    public Set<colors> getColors(List<shape> shapeList){
        Set<colors> set = new HashSet<>();
        for(shape shape : shapeList){
            set.add(shape.getColor());
        }
        return set;
    }
}
