package operation;


import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:33
 */
public class ExitOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("退出系统!");
        System.exit(0);
    }
}
