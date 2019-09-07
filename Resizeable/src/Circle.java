public class Circle implements Resizeable{

    private double radius;
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
         this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI *radius*radius;
    }
    public double getPerimeter()
    {
         return Math.PI*2*radius;
    }
    @Override
    public void resize(double percent) {
         this.setRadius((this.getRadius()*percent)/100);
    }
}
