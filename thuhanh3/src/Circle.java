public class Circle {
    private double radius;
    private String str;
    private boolean bl;
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String str, boolean bl)
    {
        this.radius= radius;
        this.str = str;
        this.bl = bl;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
