import java.util.ArrayList;
import java.util.HashSet;

public class SinglylinkedList {
    static class Node{
       public int data;
       public Node next=null;
       public Node(int data){
           this.data=data;
       }

    }

    public static Node removeDuplicates(Node head){
        HashSet<Integer> num=new HashSet<>();
        Node current=head;
        Node prev=current;

        while(current!=null) {
            if(num.contains(current.data)){
              prev.next=current.next;

            }else{
                num.add(current.data);
                prev=current;

            }
            current=current.next;

        }
            return head;

    }
    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5,6,3,7,9,19,7,3,3,19,10,8,8,9,10,6};
        Node head=new Node(1);
        Node curr=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            curr.next=newNode;
            curr=curr.next;
        }
        removeDuplicates(head);
        printList(head);
        Node i=findNthToLast1(head,5);
        System.out.println(i.data);

    }
    public static Node findNthToLast(Node head,int n){
        ArrayList<Node> nodes=new ArrayList<>();
        Node current=head;

        while(current!=null){
            nodes.add(current);
            current=current.next;
        }

        return nodes.get(nodes.size()-n);
    }
    public static Node findNthToLast1(Node head,int n){
        Node p1=head;
        Node p2=p1;

       for (int i=0;i<n-1;i++){
           if(p2==null){
               System.out.println("Not found...list size is less than n");
               break;
           }
           p2=p2.next;
       }

       while(p2.next!=null){
           p2=p2.next;
           p1=p1.next;
       }
       return p1;
    }
    public static void deleteNode(Node node){
        if(node==null || node.next==null){
            System.out.println("Imposible");
            return;
        }
        else{
            Node next=node.next;
            node.data=next.data;
            node.next=next.next;
        }
    }

}
