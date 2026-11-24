public class LastInsert {
    public static class Node {
        int data;
        Node next;
        
         //Constructor
         Node(int data)
         {
                this.data = data;
                this.next = null;
         }  

    }

    // Insert node at last
    public Node insertLast(Node head, int item)
    {
        Node newNode = new Node(item);
        if(head == null)
            {
                return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head; // head remains unchanged
    }

    public static void display(Node temp){
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

       public static void main(String[] args) {
      Node n1 = new Node(10);
       Node n2 = new Node(20);
       Node n3 = new Node(30);    

        Node head = n1;
       n1.next = n2;
       n2.next = n3;
       n3.next = null;  
       
       // System.out.println("head" + n1.data +"->"+ n2.data +"->"+ n3.data);
       display(head);

       LastInsert li = new LastInsert();
       head = li.insertLast(head, 40);
       System.out.println("After inserting 40:");
       display(head);
    }
}