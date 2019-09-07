public class Square implements Resizeable{
    private double x;

    public Square()
    {

    }
    public Square(double x)
    {
        this.x = x;

    }
    public double getX()
    {
        return this.x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getArea()
    {
        return x*x;
    }

    @Override
    public void resize(double percent) {
       this.setX((this.getX()*percent)/100);
    }
}
