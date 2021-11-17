package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-16
 * Time: 23:17
 */
public class BookList {
    private Book[] books=new Book[10];
    private int useSize;
    public BookList(){
        books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("西游记", "吴承恩", 100, "小说");
        this.useSize=3;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
    //获取到pos位置的一本书
    public Book getPos(int pos){
        return this.books[pos];
    }
    //设置pos下标为一本书
    public void setBook(int pos,Book book){
        this.books[pos]=book;
    }
}
