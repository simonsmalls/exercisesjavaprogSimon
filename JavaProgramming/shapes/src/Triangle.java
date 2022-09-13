public class Triangle extends Shape {

    private double width;
    private  double height ;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height/2;
    }

    @Override
    public String tostring() {
        return "triangle with height"+height+ "width"+width+" "+ getColor();
    }
}
