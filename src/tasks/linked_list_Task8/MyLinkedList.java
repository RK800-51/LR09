package tasks.linked_list_Task8;

public class MyLinkedList {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            this.val = value;
            this.next = null;
        }
    }

    public void addElement(int value) {
        // создаем голову или если она уже есть, то добавляем элемент (справа)
        ListNode newHead = new ListNode(value);
        if (this.head == null) {
            this.head = newHead;
        }
        else {
            ListNode last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newHead;
        }
    }
    public void insertElement(int value, int index) {
        // вставляем элемент по заданному индексу
        int counter = 1;
        ListNode ref = this.head;
        ListNode node = new ListNode(value);
        if (index == 0 && ref.next == null) {
            ref.next = node;
        }
        else {
            while (ref.next != null && counter < index) {
                counter++;
                ref = ref.next;
            }
            node.next = ref.next;
            ref.next = node;
        }

    }

    public void removeFirst() {
        // удаляем голову, ссылаемся на новую голову
        this.head = this.head.next;
    }

    public void removeLast() {
        // удаляем последний элемент (хвост)
        ListNode last = this.head;
        while (last.next.next != null) {
            last = last.next;
        }
        last.next = null;
    }

    public void remove(int index) {
        // удаляем элемент по заданному индексу
        int counter = 1;
        ListNode ref = this.head;
        if (index == 0 && ref.next == null) {
            this.head = null;
        }
        else if (index == 0 && ref.next != null) {
            this.head = ref.next;
        }
        else {
            while (ref.next != null && counter < index) {
                counter++;
                ref = ref.next;
            }
            ref.next = ref.next.next;
        }
    }

    @Override
    public String toString(){
        // выводим в консоль все имеющиеся элементы
        StringBuilder result = new StringBuilder();
        ListNode currNode = this.head;
        System.out.print("LinkedList: ");

        while (currNode != null) {
            result.append(currNode.val);
            currNode = currNode.next;
        }
        return result.toString();
    }
}
