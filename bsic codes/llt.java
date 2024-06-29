
public class llt {

  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public int display() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + "-->");
      count++;
      current = current.next;

    }
    System.out.print("null");
    return count;
  }

  public void insert(int value) {
    ListNode newnode = new ListNode(value);
    newnode.next = head;
    head = newnode;

  }

  public void insertAtEnd(int value) {
    ListNode newnode = new ListNode(value);
    if (head == null) {
      head = newnode;
      return;
    }
    ListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newnode;
  }

  public void insertAtIndex(int value, int index) {
    ListNode newnode = new ListNode(value);
    if (index == 0) {
      newnode.next = head;
      head = newnode;
      return;
    }
    ListNode current = head;
    int i = 0;
    while (i != index - 1) {
      current = current.next;
      i++;
    }
    newnode.next = current.next;
    current.next = newnode;
  }

  public ListNode delete() {
    if (head == null) {
      return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }

  public ListNode deleteatindex(int index) {
    if (head == null) {
      return null;
    }
    ListNode temp = head;
    ListNode previous = null;
    int i = 0;
    while (i != index) {
      previous = temp;
      temp = temp.next;
      i++;
    }
    previous.next = temp.next;
    return temp;
  }

  public ListNode deleteend() {
    if (head == null) {
      return null;
    }
    ListNode temp = head;
    ListNode previous = null;
    while (temp.next != null) {
      previous = temp;
      temp = temp.next;
    }
    previous.next = null;

    return temp;
  }

  public boolean serachll(int key) {
    ListNode current = head;
    while (current != null) {
      if (current.data == key) {
        return true;
      }
      current = current.next;

    }

    return false;

  }

  // public String toString() {
  // return Integer.toString(this.data);
  // }

  public ListNode findnodeatend(int n) {
    ListNode current = head;
    ListNode previous = null;
    int count = 0;

    while (current != null) {
      if (count >= n) {
        previous = previous.next;
      }
      current = current.next;
      count++;
    }

    return previous;
  }

  public void reversell() {
    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
  }

  public void removeduplicate() {
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  // aessl =add data in shorted singly lintked list
  public void aessl(int data) {
    ListNode newnode = new ListNode(data);
    if (head == null || data <= head.data) {
      newnode.next = head;
      head = newnode;
      return;

    }
    ListNode current = head;
    while (current.next != null && data > current.next.data) {
      current = current.next;
    }
    newnode.next = current.next;
    current.next = newnode;

  }

  // rkn =remove key node
  public void rkn(int key) {
    if (head == null) {
      return;
    }
    if (head.data == key) {
      head = head.next;
      return;
    }
    ListNode current = head;
    while (current.next != null) {
      if (current.next.data == key) {
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }

  // public boolean detect_loop() {
  // ListNode slow = head;
  // ListNode fast = head;
  // while (fast != null && fast.next != null) {
  // fast = fast.next.next;
  // slow = slow.next;
  // if (slow == fast) {
  // return true;
  // }

  // }
  // return false;
  // }

  public ListNode detectLoop() {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        // Loop detected
        ListNode meetingPoint = slow;
        ListNode start = head;

        while (start != meetingPoint) {
          start = start.next;
          meetingPoint = meetingPoint.next;
        }

        return start; // Return the starting node of the loop
      }
    }

    return null; // No loop found
  }

  public void removeloop(ListNode slow) {
    ListNode temp = head;
    if (slow == head) {
      while (slow.next != head) {
        slow = slow.next;
      }
      slow.next = null;
      return;
    }
    while (slow.next != temp.next) {
      slow = slow.next;
      temp = temp.next;
    }
    slow.next = null;
  }

  public static void main(String[] args) {

    llt sll = new llt(); // sll = singly linked list ;; llt=linked list
    sll.head = new ListNode(35);
    ListNode second = new ListNode(78);
    ListNode third = new ListNode(120);
    ListNode fourth = new ListNode(230);

    sll.head.next = second;
    sll.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = second;

    // System.out.println();
    // int r = sll.display();
    // System.out.println("length of the linked list " + r);

    // sll.insert(20);

    // System.out.println();
    // sll.display();
    // System.out.println();
    // sll.insertAtEnd(23435);
    // sll.display();
    // System.out.println();
    // sll.insertAtIndex(100, 3);
    // sll.display();
    // sll.delete();
    // System.out.println();
    // sll.display();
    // sll.deleteend();
    // System.out.println();
    // sll.display();
    // sll.deleteatindex(3);
    // System.out.println();
    // sll.display();
    // sll.serachll(23);
    // System.out.println();
    // System.out.println(sll.serachll(23));
    // sll.reversell();
    // sll.display();
    // System.out.println(sll.findnodeatend(2));
    // sll.removeduplicate();
    // sll.display();
    // sll.aessl(60);
    // System.out.println();
    // sll.display();
    // sll.rkn(60);
    // System.out.println();
    // sll.display();
    // System.out.print(sll.detect_loop());
    ListNode loopNode = sll.detectLoop();
    if (loopNode != null) {
      System.out.println("Loop detected at node with data: " + loopNode.data);
    } else {
      System.out.println("No loop detected");
    }
    sll.removeloop(loopNode);
    sll.display();
  }
}
