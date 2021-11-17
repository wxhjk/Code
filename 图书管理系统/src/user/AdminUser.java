package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-17
 * Time: 8:26
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("==========管理员用户============");
        System.out.println("HELLO "+this.name+" 欢迎使用图书馆管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("===============================");
        System.out.println("请输入你的选择:");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return  choice;
    }
}
