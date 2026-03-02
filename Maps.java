import java.util.*;

public class Maps {
    public static void main(String[] args){
long start = System.nanoTime();
Map<String,Integer> map1 = new HashMap<>();
map1.put("8", 1);
map1.put("5", 4);
map1.put("2", 6);
map1.put("6", 5);
map1.put("3", 9);
map1.put("7", 2);
map1.put("1", 8);
map1.put("4", 3);
map1.put("9", 7);
map1.put("10", 10);
long end = System.nanoTime();

long time = end - start;
System.out.println("Hashmap : " + time + " ns");
System.out.println(map1);

start = System.nanoTime();
Map<String,Integer> map2 = new TreeMap<>();
map2.put("8", 1);
map2.put("5", 4);
map2.put("2", 6);
map2.put("6", 5);
map2.put("3", 9);
map2.put("7", 2);
map2.put("1", 8);
map2.put("4", 3);
map2.put("9", 7);
map2.put("10", 10);
end = System.nanoTime();
time = end - start;
System.out.println("Treemap : " + time + " ns");
System.out.println(map2);
}
}