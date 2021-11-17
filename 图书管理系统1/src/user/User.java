package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:41
 */
public abstract class User {
    protected String name;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    protected IOperation[] iOperations;
    public void doWork(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}
