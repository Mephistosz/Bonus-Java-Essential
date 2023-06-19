package generics_set_map.app;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ProgramMap {
  public static void main(String[] args) {

    String email = "email";
    String phone = "phone";

    Map<String, String> cookies = new TreeMap<>();

    cookies.put("username", "maria");
    cookies.put(email, "maria@gmail.com");
    cookies.put(phone, "99771122");

    cookies.remove(email);

    cookies.put(phone, "99771133");

    System.out.println("Contains 'phone' key: " + cookies.containsKey(phone));
    System.out.println("Phone number: " + cookies.get(phone));
    System.out.println("Email: " + cookies.get(email));
    System.out.println("Size: " + cookies.size());

    System.out.println("ALL COOKIES:");

    for (Entry<String, String> x : cookies.entrySet()) {
      System.out.println(x.getKey() + ": " + x.getValue());
    }
  }
}
