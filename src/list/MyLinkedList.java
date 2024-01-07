package list;

public class MyLinkedList<E> implements LinkedList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    @Override
    public void insertStart(E element) {
        Node<E> first = firstNode;
        first.setCurrentElement(element);
        firstNode = new Node<>(null, null, first);
        first.setPrevElement(firstNode);
        size++;
    }

    @Override
    public void insertEnd(E element) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(element);
         lastNode = new Node<>(null, prev, null);
         prev.setNextElement(lastNode);
         size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target =  getNextElement(target);

        }
        return target.getCurrentElement();
    }
    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }
    }


    }



