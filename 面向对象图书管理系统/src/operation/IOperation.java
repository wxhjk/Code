package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:36
 */
public interface IOperation {
    void work(BookList bookList);
    Scanner scanner=new Scanner(System.in);
}
