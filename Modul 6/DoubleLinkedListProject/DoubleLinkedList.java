public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void addFirst(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    Node search(Object value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    Node getAt(int index) {
        if (index < 0 || index >= size) return null;

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    void deleteAt(int index) {
        Node target = getAt(index);
        if (target == null) return;

        if (target == head) head = target.next;
        if (target == tail) tail = target.prev;

        if (target.prev != null) target.prev.next = target.next;
        if (target.next != null) target.next.prev = target.prev;

        size--;
    }

    void deleteByValue(Object value) {
        Node target = search(value);
        if (target == null) return;

        if (target == head) head = target.next;
        if (target == tail) tail = target.prev;

        if (target.prev != null) target.prev.next = target.next;
        if (target.next != null) target.next.prev = target.prev;

        size--;
    }

    void insertAt(int index, Node data) {
        if (index <= 0) {
            addFirst(data);
            return;
        }
        if (index >= size) {
            addLast(data);
            return;
        }

        Node current = getAt(index);

        Node prevNode = current.prev;

        prevNode.next = data;
        data.prev = prevNode;

        data.next = current;
        current.prev = data;

        size++;
    }

    void insertAfter(Object value, Node data) {
        Node current = search(value);
        if (current == null) return;

        if (current == tail) {
            addLast(data);
            return;
        }

        Node nextNode = current.next;

        current.next = data;
        data.prev = current;

        data.next = nextNode;
        nextNode.prev = data;

        size++;
    }

    void insertBefore(Object value, Node data) {
        Node current = search(value);
        if (current == null) return;

        if (current == head) {
            addFirst(data);
            return;
        }

        Node prevNode = current.prev;

        prevNode.next = data;
        data.prev = prevNode;

        data.next = current;
        current.prev = data;

        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        list.addLast(A);
        list.addLast(B);
        list.addLast(C);

        System.out.println("== LIST AWAL ==");
        list.print();

        System.out.println("\nSearch B: " + list.search("B").data);

        System.out.println("Index 1: " + list.getAt(1).data);

        list.insertAt(1, D);
        System.out.println("\n== Setelah insertAt(1, D) ==");
        list.print();

        list.insertAfter("B", new Node("E"));
        System.out.println("\n== Setelah insertAfter B (E) ==");
        list.print();

        list.insertBefore("C", new Node("F"));
        System.out.println("\n== Setelah insertBefore C (F) ==");
        list.print();

        list.deleteAt(2);
        System.out.println("\n== Setelah deleteAt(2) ==");
        list.print();

        list.deleteByValue("B");
        System.out.println("\n== Setelah deleteByValue B ==");
        list.print();

        System.out.println("\n== Print Reverse ==");
        list.printReverse();
    }
}