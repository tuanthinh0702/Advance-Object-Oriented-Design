public class Rectangle implements Resizeable {
    private double x;
    private double y;
    public Rectangle()
    {

    }
    public Rectangle(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public void setXY(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public double[] getXY()
    {
        double[] xy = { this.x,this.y};
        return xy;
    }
    public double getArea()
    {
        return x*y;
    }
    public  double perimeter()
    {
         return (x+y)*2;
    }

    @Override
    public void resize(double percent) {
        this.setXY((this.getX()*percent)/100,(this.getY()*percent)/100);
    }
}
