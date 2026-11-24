public class SLLOperations {
    public static class Node {
        int data;
        Node next;
        
         //Constructor
        public Node(int item){
            this.data = item;
            this.next = null;
        } 
    }

    // insert at first
    public Node insertFirst(Node head, int item){
        Node newNode = new Node(item);
        newNode.next = head;
        return newNode; // new head
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
       
       System.out.println("Original List:");
       display(head);

       SLLOperations sllOps = new SLLOperations();
       head = sllOps.insertFirst(head, 5); // Insert 5 at the beginning

       System.out.println("After Inserting 5 at the beginning:");
       display(head);
    }
    
}

