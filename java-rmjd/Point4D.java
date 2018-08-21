import java.awt.*;

public class Point4D extends Point3D {
    public int t;

    public Point4D(int x, int y, int z, int t) {
        super(x,y,z);

        if(t > 0) {
            this.t = t;
        }
    }

    public void move(int x, int y, int z, int t) {
        super.move(x,y,z);

        if(t > 0) {
            this.t = t;
        }
    }

    public void translate(int x, int y, int z, int t) {
        super.translate(x,y,z);

        if(t >0) {
            this.t += t;
        }
    }

    public static void main(String[] args) {
        Point4D p4d = new Point4D(2,3,4,-20);
        System.out.println(p4d.x + "," + p4d.y + "," + p4d.z + "," + p4d.t);

        p4d.move(6,6,6,30);
        System.out.println(p4d.x + "," + p4d.y + "," + p4d.z + "," + p4d.t);

        p4d.translate(10,10,10,15);
        System.out.println(p4d.x + "," + p4d.y + "," +p4d.z + "," + p4d.t);
    }
}
