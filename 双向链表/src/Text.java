/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-09
 * Time: 22:25
 */
public class Text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addIndex(4,5);
        myLinkedList.display();
    }
}
