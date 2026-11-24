public class SLLPractice {
    public static class Node {
        int data;
        Node next;
        
         //Constructor
        public Node(int item){
            this.data = item;
            this.next = null;
        } 
      /*  void Insert_at_first(){
            System.out.println("Insert your data :");
        } */ 
    }
    public static void display(Node temp){
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
    }

    // insert at first
    public void insertfirst(int item){
        Node newNode;
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
    }
}