package user;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-17
 * Time: 8:30
 */
//整个程序的入口
public class Main {
    public static User login(){
        System.out.println("请输入你的姓名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份:1-》管理员，0-》用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();//向上转型
        while(true){
            int choice= user.menu();
            user.doWork(choice,bookList);
        }//动态绑定
    }
}
