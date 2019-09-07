public class Main {
    public static void main(String[] args) {
        double count = Math.floor(Math.random()*100)+1;
        for(int i=1;i<=3;i++)
        {
           if(i==1)
           {
               Circle c = new Circle(2);
               System.out.println("trước khi tăng kích thước"+c.getArea());
               c.setRadius(c.getRadius()+count);
               System.out.println("sau khi tăng kích thước"+c.getArea());
           }
           else if(i==2)
           {
               Rectangle R = new Rectangle(2,3);
               System.out.println("trước khi tăng kích thước"+R.getArea());
               R.setXY(R.getX()+count,R.getY()+count);
               System.out.println("sau khi tăng kích thước"+R.getArea());
           }
           else if(i==3)
           {
                Square S = new Square(2);
               System.out.println("trước khi tăng kích thước"+S.getArea());
               S.setX(S.getX()+count);
               System.out.println("sau khi tăng kích thước"+S.getArea());
           }
        }
    }
}
