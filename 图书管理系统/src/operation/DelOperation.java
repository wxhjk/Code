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
public class DelOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的图书的名字:");
        String name=scanner.nextLine();
        int size=bookList.getUseSize();
        int index=0;
        int i=0;
        for(;i<size;i++){
            Book book=bookList.getPos(i);
            if(book.getName().equals(name)){
                index=i;
                break;
            }
        }
        if(i>=size){
            System.out.println("没有你要删除的图书！");
            return;
        }
        for(i=index;i<size-1;i++){
            Book book=bookList.getPos(i+1);
            bookList.setBook(i,book);
        }
        bookList.setBook(size,null);//防止内存泄漏
        bookList.setUseSize(size-1);
        System.out.println("删除成功! ");
    }
}
