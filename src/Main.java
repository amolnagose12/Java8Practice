import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Amol","Amol","Pratik","John","Robert"};
        FrequencyOfElement obj = new FrequencyOfElement();

//        System.out.println(obj.freqOfElement(arr));

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        Set<Map.Entry<Integer, Long>> entries = collect.entrySet();

        entries.forEach(entry -> System.out.println(entry));


    }
}