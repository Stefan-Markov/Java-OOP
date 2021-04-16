package Shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        if (this.getPerimeter() != null) {
            return getPerimeter();
        }
        Double param = 2 * Math.PI * this.radius;
        super.setPerimeter(param);

        return param;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public Double calculateArea() {
        if (this.getArea() != null) {
            return getArea();
        }
        Double area = Math.PI * this.radius * this.radius;
        return  area;
    }
}
