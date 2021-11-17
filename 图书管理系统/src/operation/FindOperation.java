package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:32
 */
public class FindOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("请输入你要查找的图书!");
        String name=scanner.nextLine();
        int size= bookList.getUseSize();;
        for(int i=0;i<size;i++){
            if(bookList.getPos(i).getName().equals(name)){
                System.out.println("找到此书如下:");
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("未找到要查找的图书！");
    }
}
