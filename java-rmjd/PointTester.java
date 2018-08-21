import java.awt.*;

class PointTester {
    public static void main(String[] args) {
        Point obj1 = new Point(11,22);
        Point3D obj2 = new Point3D(6,6,6);

        obj1.move(11,11);
        obj1.translate(2,2);

        System.out.println(obj1.x +" " + obj1.y);

        obj2.move(2,3,4);
        obj2.translate(2,2,2);

        System.out.println(obj2.x + " " + obj2.y + " " + obj2.z);
    }
}
