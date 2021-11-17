package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:33
 */
public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅图书！");
        System.out.println("请输入你要借阅的图书的名字");
        String name=scanner.nextLine();
        int size=bookList.getUseSize();
        for(int i=0;i<size;i++){
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrow(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要借阅的图书！");
    }
}
