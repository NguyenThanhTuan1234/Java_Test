package Stack;

/**
 * Created by tuankun on 23/06/2017.
 */
public class Stack {
    int size;
    Node top;

    public Stack(){
        size = 0;
        top = new Node();
    }
    //Them 1 phan tu vao dau ngan xep
    public void push(int item){
        size++;
        this.top.item = item;
    }

    //Lay phan tu tren dinh ngan xep
    public int pop(){
        int item;
        if(isEmpty()){
            return 0;
        }
        else{
            Node tmp = this.top;
            this.top = tmp.next;
            this.size--;
            return tmp.item;

        }
    }

    //Kiem tra ngan xep co rong hay ko
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }

    //Kiem tra so phan tu cua ngan xep
//    public int numOfElement(){
//
//    }

    public void display(){
        Node n=this.top;
       for(int i=0;i<this.size;i++) {
           System.out.print(n.item);
           n=n.next;
       }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.pop();
        st.display();
    }
}