package Shape;

/**
 * Created by tuankun on 27/06/2017.
 */
public class TestComposition {
    public static void main(String[] args) {
        Point point = new Point();
        Graphic graphic = new Graphic();
        graphic.shapes.add(point);
        graphic.Add(point);

        Line line = new Line();
        graphic.shapes.add(line);
        graphic.Add(line);

        graphic.shapes.remove(point);
        graphic.Remove(point);
    }
}
