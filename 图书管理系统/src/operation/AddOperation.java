package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:32
 */
public class AddOperation implements IOperation{
    public void work(BookList bookList){
        int size=bookList.getUseSize();
        System.out.println("新增图书!");
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price=scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type=scanner.next();
        Book book=new Book(name,author,price,type);
        bookList.setBook(size,book);
        bookList.setUseSize(size+1);
    }
}
