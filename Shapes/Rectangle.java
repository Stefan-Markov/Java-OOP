package Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double weight) {
        this.height = height;
        this.width = weight;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public Double calculatePerimeter() {
        if (this.getPerimeter() != null) {
            return getPerimeter();
        }
        Double param = (this.width * 2) + (2 * this.height);
        super.setPerimeter(param);

        return param;
    }

    @Override
    public Double calculateArea() {
        if (this.getArea() != null) {
            return getArea();
        }
        return this.width * this.height;
    }
}
