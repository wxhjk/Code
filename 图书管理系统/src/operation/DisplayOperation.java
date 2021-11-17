package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:39
 */
public class DisplayOperation implements IOperation{
    public void work(BookList bookList){
        int size=bookList.getUseSize();
        for(int i=0;i<size;i++){
            Book book=bookList.getPos(i);
            System.out.println(book);
        }
    }
}
