/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-10
 * Time: 17:01
 */
public class Text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
//        myLinkedList.addLast(1);
//        myLinkedList.addLast(2);
//        myLinkedList.addLast(3);
//        myLinkedList.addLast(4);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addIndex(2,10);
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
    }
}
