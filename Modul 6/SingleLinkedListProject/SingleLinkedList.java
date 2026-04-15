public class SingleLinkedList {
    Node head, tail;
    int size = 0;

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            data.next = head;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    Node findNode(Object nilai) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(nilai)) return current;
            current = current.next;
        }
        return null;
    }

    Node findNodeAt(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    void removeAt(int index) {
        if (isEmpty() || index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node prev = findNodeAt(index - 1);
            prev.next = prev.next.next;
            if (prev.next == null) tail = prev;
        }
        size--;
    }

    void removeValue(Object nilai) {
        if (isEmpty()) return;
        if (head.data.equals(nilai)) {
            removeAt(0);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(nilai)) {
                if (current.next == tail) tail = current;
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    void addAt(int index, Node data) {
        if (index < 0 || index > size) return;
        if (index == 0) addFirst(data);
        else if (index == size) addLast(data);
        else {
            Node prev = findNodeAt(index - 1);
            data.next = prev.next;
            prev.next = data;
            size++;
        }
    }

    void addAfter(Object nilai, Node data) {
        Node target = findNode(nilai);
        if (target != null) {
            data.next = target.next;
            target.next = data;
            if (target == tail) tail = data;
            size++;
        }
    }

    void addBefore(Object nilai, Node data) {
        if (isEmpty()) return;
        if (head.data.equals(nilai)) {
            addFirst(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(nilai)) {
                data.next = current.next;
                current.next = data;
                size++;
                return;
            }
            current = current.next;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println(" -> NULL");
    }

public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList();

        System.out.println("--- Data Awal ---");
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("C"));
        list.printList();

        System.out.println("\n--- Test (a & b) Cari Data ---");
        Node fVal = list.findNode("B");
        System.out.println("Cari 'B': " + (fVal != null ? "Ketemu" : "Null"));
        Node fIdx = list.findNodeAt(2);
        System.out.println("Data index 2: " + (fIdx != null ? fIdx.data : "Null"));

        System.out.println("\n--- Test (e) addAt index 1 (X) ---");
        list.addAt(1, new Node("X"));
        list.printList();

        System.out.println("\n--- Test (f) addAfter 'B' (Y) ---");
        list.addAfter("B", new Node("Y"));
        list.printList();

        System.out.println("\n--- Test (g) addBefore 'A' (Z) ---");
        list.addBefore("A", new Node("Z"));
        list.printList();

        System.out.println("\n--- Test (c) removeAt index 2 ---");
        list.removeAt(2); 
        list.printList();

        System.out.println("\n--- Test (d) removeValue 'C' ---");
        list.removeValue("C");
        list.printList();
    }
}