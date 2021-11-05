/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-04
 * Time: 13:34
 */
public class Text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createList();
        myLinkedList.display();
        System.out.println(myLinkedList.contains(34));
        System.out.println(myLinkedList.size());
        myLinkedList.addFirst(11);
        myLinkedList.display();
        myLinkedList.addLast(66);
        myLinkedList.display();
        myLinkedList.addIndex(3,33);
        myLinkedList.display();
        myLinkedList.remove(11);
        myLinkedList.display();
    }
}
