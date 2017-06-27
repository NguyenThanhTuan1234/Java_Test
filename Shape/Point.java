package Shape;

import sun.security.provider.SHA;

/**
 * Created by tuankun on 27/06/2017.
 */
public class Point extends Shape {
    int x; //x la hoanh do
    int y; //y la tung do

    public Point() {
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

    @Override
    public void Operation(){
        System.out.println("Point");
    }
}
