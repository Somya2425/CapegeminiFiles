package StreamAPITask;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,5,5,3,21,1,13,3,12};

        Map<Integer, Long> freq = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(n-> n, Collectors.counting()));
        System.out.println(freq);

    }
}


