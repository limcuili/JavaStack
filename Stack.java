public class Stack {
    private Item top = null;

    private class Item {
        private int value; // every item has a value represented as an integer.
        private Item next; // every item has a next represented as another Item.
    }

    public int pop() { // last in first out; popping the top item off the stack.
        if (top == null) { // if there doesn't exist an item on top.
            return -1;
        }
        int x = top.value; // x is the value of the top; we return this.
        top = top.next; // then we set top to be the next item in the linked list.
        return x;
    }

    public void push(int x) { // adding an value x on top of stack.
        Item p = new Item();
        p.value = x;
        p.next = top; // setting p's next as the current top.
        top = p;
    }

}