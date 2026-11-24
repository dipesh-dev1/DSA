public class SLLOperations {
   public SLLOperations() {
   }

   public Node insertFirst(Node var1, int var2) {
      Node var3 = new Node(var2);
      var3.next = var1;
      return var3;
   }

   public static void display(Node var0) {
      while(var0 != null) {
         System.out.print(var0.data + "->");
         var0 = var0.next;
      }

      System.out.println("null");
   }

   public static void main(String[] var0) {
      Node var1 = new Node(10);
      Node var2 = new Node(20);
      Node var3 = new Node(30);
      Node var4 = new Node(40);


      var1.next = var2;
      var2.next = var3;
      var3.next = var4;
    var4.next=null;
      System.out.println("Original List:");
      display(var1);
      SLLOperations var6 = new SLLOperations();
      Node var5 = var6.insertFirst(var1, 5);
      System.out.println("After Inserting 5 at the beginning:");
      display(var4);
   }

   public static class Node {
      int data;
      Node next;

      public Node(int var1) {
         this.data = var1;
         this.next = null;
      }
   }
}

