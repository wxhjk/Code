import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-10-31
 * Time: 18:39
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;//有效的数据个数

    public MyArrayList() {
        this.elem = new int[10];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 获取顺序表的有效数据长度
    public int size() {
        return this.usedSize;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos<0||pos>usedSize){
            System.out.println("输入错误");
            return;
        }
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*usedSize);
        }
        for (int i = usedSize-1; i >=pos ; i--) {
            this.elem[i]=this.elem[i+1];
        }
            this.elem[pos]=data;
            usedSize++;
    }

    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0||pos>=usedSize){
            System.out.println("pos位置错误");
            return -1;
        }
        if(Empty()){
            System.out.println("顺序表为空");
            return -1;
        }
        return this.elem[pos];
    }
    public boolean Empty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0||pos>=usedSize){
            System.out.println("pos位置错误");
            return;
        }
        if(Empty()){
            System.out.println("顺序表为空");
            return;
        }
        this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(Empty()){
            System.out.println("顺序表为空");
            return;
        }
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有要找的数字");
            return;
        }
        for (int i = index; i < usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }
}
