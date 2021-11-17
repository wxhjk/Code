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
public class ReturnOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("归还图书!");
        System.out.println("请输入你要归还的图书的名字");
        String name=scanner.nextLine();
        int size=bookList.getUseSize();
        for(int i=0;i<size;i++){
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())&& book.isBorrow()){
                book.setBorrow(false);
                System.out.println("归还成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("归还失败！");
    }
}
