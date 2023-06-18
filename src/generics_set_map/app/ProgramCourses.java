package generics_set_map.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramCourses {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Set<Integer> set = new HashSet<>();

    System.out.print("How many students for course A? ");
    int numberOfStudents = sc.nextInt();

    for (int i = 0; i < numberOfStudents; i++) {
      set.add(sc.nextInt());
    }

    System.out.print("How many students for course B? ");
    numberOfStudents = sc.nextInt();

    for (int i = 0; i < numberOfStudents; i++) {
      set.add(sc.nextInt());
    }

    System.out.print("How many students for course C? ");
    numberOfStudents = sc.nextInt();

    for (int i = 0; i < numberOfStudents; i++) {
      set.add(sc.nextInt());
    }

    System.out.print("Total students: " + set.size());

    sc.close();
  }
}
