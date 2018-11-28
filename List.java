public class List {

    public Item start = null;

    private class Item {
        private int value;
        private Item next;
        private Item(int x, Item item) { value = x; next = item;}
    }

    public void insertAfter(Item item, int x) {
        if (item == null) { // put the new item of value x at the start of the list.
            start = new Item(x,start);
        } else {
            item.next = new Item(x, item.next); // set item's pointer to point to the new item of value x.
        }
    }

    public void deleteAfter (Item item) {
        if (item == null) { // delete the first item on the list.
            start = start.next;
        } else {
            item.next = item.next.next;
        }
    }

}