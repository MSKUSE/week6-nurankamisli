public class Main {
    public static void main(String[] args) {
        Point p=new Point(3,4);
        Rectangle r1=new Rectangle(p,3,4);
        System.out.println(r1.area());

        Point p=new Point(3,4,);
        Rectangle t1= new Rectangle(p,3,4);
        System.out.println(t1.area());



    }
}