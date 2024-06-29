// import java.util.LinkedList;

public class opwll {
  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void display() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + "-->");
      current = current.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    opwll ll = new opwll();
    ll.head = new ListNode(23);
    ListNode second = new ListNode(3);
    ListNode third = new ListNode(230);
    ListNode fourth = new ListNode(23333);

    ll.head.next = second;
    second.next = third;
    third.next = fourth;

    ll.display();
  }
}