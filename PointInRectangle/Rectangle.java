package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point bottomRight;

    public Rectangle(Point bottomLeft, Point bottomRight) {
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public boolean contains(Point point2d) {
        return point2d.getX() >= bottomLeft.getX() &&
                point2d.getX() <= bottomRight.getX() &&
                point2d.getY() >= bottomLeft.getY() &&
                point2d.getY() <= bottomRight.getY();
    }
}
