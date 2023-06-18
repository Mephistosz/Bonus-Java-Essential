package generics_set_map.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

  private List<T> list = new ArrayList<>();

  public void addValue(T obj) {
    list.add(obj);
  }

  public T first() {
    if (list.isEmpty()) {
      throw new IllegalStateException("List is empty");
    }
    return list.get(0);
  }

  public void print() {

    if (list.isEmpty()) {
      throw new IllegalStateException("List is empty");
    }

    System.out.print("[" + first());

    for (int i = 1; i < list.size(); i++) {
      System.out.print(", " + list.get(i));
    }

    System.out.println("]");
    System.err.print("First: " + first());
  }
}
