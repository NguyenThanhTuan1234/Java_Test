package Shape;

/**
 * Created by tuankun on 27/06/2017.
 */
abstract class Shape {

    public abstract void Operation();

    public void Add(Shape shape){
        System.out.println("Add ");
        shape.Operation();
    }

    public void Remove(Shape shape){
        System.out.println("Remove");
        shape.Operation();
    }
}
