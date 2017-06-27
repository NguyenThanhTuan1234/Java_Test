package Point;

/**
 * Created by tuankun on 23/06/2017.
 */
public class Point {
    int x; //Hoanh do
    int y; //Tung do
    int h; //Cao do
    //Phuong thuc khoi tao khong tham so
    public Point(){

    }
    //Phuong thuc khoi tao co tham so
    public Point(int x,int y,int h){
        this.x = x;
        this.y = y;
        this.h = h;
    }
    //Phuong thuc khoi tao nhan 1 doi tuong cua lop nay lam tham so
    //Point.Point point = new Point.Point();
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
        this.h = point.h;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void display(){
        System.out.println("(" + x +"," + y + "," + h + ")");
    }

}
