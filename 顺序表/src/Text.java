/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-10-31
 * Time: 18:38
 */
public class Text {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();

    }
}
