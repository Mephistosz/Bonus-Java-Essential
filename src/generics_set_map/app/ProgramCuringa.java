package generics_set_map.app;

import java.util.Arrays;
import java.util.List;

public class ProgramCuringa {

  public static void main(String[] args) {
    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);
  }

  public static void printList(List<? extends Object> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }

}