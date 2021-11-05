/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-04
 * Time: 13:35
 */
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class MyLinkedList {

    public ListNode head;//链表的头引用

    public void createList() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        this.head = listNode1;
    }

    public void display() {
        //this.head.next != null
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
        /*if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
    }

    //尾插法
    public void addLast(int data){
        ListNode node =new ListNode(data);
        if(this.head==null){
            this.head=node;
        }
        else{
            ListNode cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }

    }

    //任意位置插入,第一个数据节点为0号下标
    public ListNode findIndex(int index){
        ListNode cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        ListNode node=new ListNode(data);
        if(index<0||index>size()){
            System.out.println("index位置不合法");
        }
        if(index==0){
            addFirst(data);
        }
        else if(index==size()){
            addLast(data);
        }
        else{
            node.next=findIndex(index).next;
            findIndex(index).next=node;
        }
    }

    //删除第一次出现关键字为key的节点
    public ListNode searchprev(int key){
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public void remove(int key){
        if(this.head==null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.val==key){
            head=this.head.next;
            return;
        }
        ListNode cur=searchprev(key);
        if(cur==null){
            System.out.println("未找到");
            return;
        }
        ListNode del=cur.next;
        cur.next=del.next;
    }

    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        if(this.head==null){
            return null;
        }
        ListNode prev=this.head;
        ListNode cur=this.head.next;
        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
            }
            else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
        return this.head;
    }
    public void clear(){
        while(this.head!=null){
            ListNode curNext=this.head.next;
            this.head.next=null;
            this.head=curNext;
        }
    }
}
