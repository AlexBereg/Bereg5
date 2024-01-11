package course_2.course_26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //        Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (!((nums.get(i) % 2) == 0)) {
                oddNumbers.add(nums.get(i));
            }
        }
        System.out.println(oddNumbers);


        //        Задание 2
        //        Задание 2
        List<Integer> nums2 = new ArrayList<>(List.of(20, 21, 12, 1, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenNumbers = new HashSet<>();
        for (Integer i : nums2) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        List<Integer> nums2Even = new ArrayList<>(evenNumbers);
        Collections.sort(nums2Even);
        System.out.println(nums2Even);

        //    ## Задание 3

        List<String> words = new ArrayList<>(List.of("пять","раз", "два", "раз", "три", "раз", "раз", "три", "два", "четыре"));
        Set<String> wordsSet = new HashSet<>();
        for (String word : words) {
            wordsSet.add(word);
        }
        System.out.println(wordsSet);

        //    ## Задание 4
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "один","один","один","три", "три", "три"));
        Map<String, Integer> stringsQuantity = new HashMap<>();
        for (String string : strings) {
            if (stringsQuantity.get(string) == null) {
                stringsQuantity.put(string, 1);
            } else stringsQuantity.put(string, stringsQuantity.get(string) + 1);
        }
        System.out.println(stringsQuantity);
    }
}
