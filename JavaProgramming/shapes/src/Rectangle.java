public class Rectangle extends Shape{
    private Color color;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width*height;

    }

    @Override
    public String tostring() {
        return "rectangle with with "+ width +"and height "+ height+ " is color "+ color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
