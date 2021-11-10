/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-09
 * Time: 22:25
 */
class ListNode {
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    public ListNode head;//指向双向链表的头节点
    public ListNode last;//指向的是尾巴节点

    //打印链表
    public void display() {
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //得到单链表的长度
    public int size() {
        int count=0;
        ListNode cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data) {
        ListNode Node=new ListNode(data);
        if(this.head==null){
            head=Node;
            last=Node;
        }else{
            Node.next=head;
            head.prev=Node;
            head=Node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode Node=new ListNode(data);
        if(this.head==null){
            head=Node;
            last=Node;
        }else{
            last.next=Node;
            Node.prev=last;
            last=Node;
        }


    }
    public ListNode search(int index){
        ListNode cur=this.head;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index>size()||index<0){
            System.out.println("节点错误");
        }else{
            if(index==0){
                addFirst(data);
            }else if(index==size()){
                addLast(data);
            }else{
                ListNode node=new ListNode(data);
                ListNode ret=search(index);
                ret.prev.next=node;
                node.prev=ret.prev;
                node.next=ret;
                ret.prev=node;
            }
        }
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    head=head.next;
                    if(head==null){
                        last=null;
                    }else{
                        head.prev=null;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }
                    else{
                        last=last.prev;
                    }
                }
                return ;
            }
                cur=cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    head=head.next;
                    if(head==null){
                        last=null;
                    }else{
                        head.prev=null;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }
                    else{
                        last=last.prev;
                    }
                }
            }
            cur=cur.next;
        }
    }


    public void clear() {
       while(head!=null){
           ListNode curNext=head.next;
           head.prev=null;
           head.next=null;
           head=curNext;
       }
       last=null;
    }

}