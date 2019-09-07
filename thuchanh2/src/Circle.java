public class Circle {
    private double radius;
    private  int fill;
    private boolean bl;
    private String str ;
     public Circle()
     {

     }
     public Circle(double radius, int fill)
     {
         this.radius= radius;
         this.fill = fill;
     }
     public Circle(double radius, String str , boolean bl)
     {
         this.radius = radius ;
         this.str = str;
         this.bl =bl;
     }
}
