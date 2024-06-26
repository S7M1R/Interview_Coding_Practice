import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDupelicateCharFromString {
    public static void main(String[] args) {
        String str = "hello world ";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect.entrySet().stream().filter(entry -> entry.getValue() == 1).sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
