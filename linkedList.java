public class linkedList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public void append(int new_data) {
    Node new_node = new Node(new_data);
    if (head == null) {
      head = new_node;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }

  public void printList() {
    Node n = head;
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
  }

  public void traverse() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }
  public void insertAtBeginning(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }
  public void insertAtEnd(int new_data) {
    Node new_node = new Node(new_data);
    if (head == null) {
      head = new_node;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }
  public void insertAfter(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("The given previous node cannot be null");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  public static void main(String[] args) {
    linkedList list = new linkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    System.out.println("Linked List:");
    list.printList();
    list.insertAtBeginning(0);
    System.out.println("Linked List after inserting at beginning:");
    list.traverse();
    list.insertAtEnd(4);
    System.out.println("Linked List after inserting at end:");
    list.traverse();
    list.insertAfter(list.head.next, 1);
    System.out.println("Linked List after inserting after second node:");
    list.traverse();
  }
}