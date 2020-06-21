package DataStructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapQuestion {
    public static void HighestOccurenceOfCharacter(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
            //   System.out.println(map.entrySet());
        }
        Set<Map.Entry<Character, Integer>> en = map.entrySet();
        int largest = Integer.MIN_VALUE;
        char c = 0;
        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() > largest) {
                largest = val.getValue();
                c = val.getKey();

            }


        }
        System.out.println("First largest occurece=" + c + "=" + largest);


    }

    public static void lowestOccurenceOfCharacter(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }

        }
        System.out.println(map.entrySet());
        Set<Map.Entry<Character, Integer>> en = map.entrySet();
        int lowest = Integer.MAX_VALUE;

        char u = 0;
        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() < lowest) {
                lowest = val.getValue();
                u = val.getKey();

            }


        }
        System.out.println("First lowest occurence =" + u + "=" + lowest);


    }

    public static void uniqueoccurence(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
            //   System.out.println(map.entrySet());
        }
        Set<Map.Entry<Character, Integer>> en = map.entrySet();


        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() <= 1) {
                System.out.println(val.getKey() + "=" + val.getValue());


            }


        }


    }

    public static void Repeatedcharacter(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
            //   System.out.println(map.entrySet());
        }
        Set<Map.Entry<Character, Integer>> en = map.entrySet();


        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() > 1) {

                System.out.println("RepeatedCharacter=" + val.getKey());

            }


        }


    }

    public static void NonRepeated(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
            //   System.out.println(map.entrySet());
        }
        Set<Map.Entry<Character, Integer>> en = map.entrySet();

        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() <= 1) {

                System.out.println(val.getKey());
            }


        }


    }

    public static void vowelcontainscharacter(String s) {
        String st = s.replaceAll(" ", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] ch = st.toCharArray();
        for (char i : ch) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
            //   System.out.println(map.entrySet());
        }
        Set<Map.Entry<Character, Integer>> en = map.entrySet();

        for (Map.Entry<Character, Integer> val : en) {

            if (val.getValue() > 1 && val.getKey() == 'a' || val.getKey() == 'e' || val.getKey() == 'i' || val.getKey() == 'o' || val.getKey() == 'u') {

                System.out.println("Repeated vowel=" + val.getKey());
            }


        }


    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,3};
        String s = "java is a Greattttttt Language";
        String a = "ab#cd@@u";
        MapQuestion.HighestOccurenceOfCharacter(s);
        MapQuestion.lowestOccurenceOfCharacter(s);
        MapQuestion.NonRepeated(s);
        MapQuestion.uniqueoccurence(s);
        MapQuestion.vowelcontainscharacter(s);
    }
}