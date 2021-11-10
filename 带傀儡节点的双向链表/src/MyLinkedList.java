/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 85130
 * Date: 2021-11-10
 * Time: 17:02
 */
class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class MyLinkedList {
    public ListNode head=new ListNode(-1);
    public ListNode last=head;

    //得到单链表的长度
    public int size(){
        ListNode cur=this.head.next;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    };
    public void display(){
        ListNode cur=this.head.next;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    };
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head.next==null){
            this.head.next=node;
            node.prev=head;
            last=node;
        }
        else{
            node.next=this.head.next;
            this.head.next.prev=node;
            this.head.next=node;
            node.prev=head;
        }
    };
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        this.last.next=node;
        node.prev=last;
        last=node;
    };
    public ListNode search(int index){
        ListNode cur=this.head.next;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size()){
            System.out.println("位置错误");
        }else if(index==0){
            addFirst(data);
        }else if(index==size()){
            addLast(data);
        }else{
            ListNode cur=search(index);
            ListNode node=new ListNode(data);
            cur.prev.next=node;
            node.prev=cur.prev;
            node.next=cur;
            cur.prev=node;
        }
    };
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head.next;
        while(cur!=head){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    };
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=this.head.next;
        while(cur!=null){
            if(cur.val==key){
                if(cur==head.next){
                   this.head.next=cur.next;
                   if(cur.next==null){
                       last=null;
                   }else{
                       cur.next.prev=cur.prev;
                   }
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next==null){
                        last=last.prev;
                    }else{
                        cur.next.prev=cur.prev;
                    }
                }
                return ;
            }
                cur=cur.next;
        }
    };
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head.next;
        while(cur!=null){
            if(cur.val==key){
                if(cur==head.next){
                    this.head.next=cur.next;
                    if(cur.next==null){
                        last=null;
                    }else{
                        cur.next.prev=cur.prev;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next==null){
                        last=last.prev;
                    }else{
                        cur.next.prev=cur.prev;
                    }
                }
            }
            cur=cur.next;
        }
    };
    public void clear(){
        while(this.head!=null){
            ListNode cur=head.next;
            head.prev=null;
            head.next=null;
            head=cur;
        }
    };
}
