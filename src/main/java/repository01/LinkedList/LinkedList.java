package repository01.LinkedList;

import java.util.Iterator;

/*
  generic double linked list
* */

public class LinkedList<T> implements Iterable<T>{

  private ListElement first = null, last = null;

  public void add(T data) {
    last = new ListElement(data, null, this.last);

    if(first == null) {
      first = last;
    }
    if(last.predecessor != null) {
      last.predecessor.successor = this.last;
    }
  }

  private class ListElement {
    T data;
    ListElement successor, predecessor;

    public ListElement(T data, ListElement successor, ListElement predecessor) {
      this.data = data;
      this.successor = successor;
      this.predecessor = predecessor;
    }
  }

  @Override
  public Iterator<T> iterator() {
    return new SimpleIterator();
  }

  private class SimpleIterator implements Iterator<T> {
    private ListElement current = first;

    @Override
    public boolean hasNext() { return current != null; }

    @Override
    public T next() {
      T tmp = current.data;
      current = current.successor;
      return tmp;
    }
  }
}
