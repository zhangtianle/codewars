package five;

/**
 * Created by Tianle Zhang on 2016/7/7.
 */
public class WeightSort {

    public static String orderWeight(String string) {
        String[] numbers = string.split(" ");
        sortByWeight(numbers);
        return arrayToString(numbers);
    }

    // Weight of a number is a sum of its digits
    public static int Weight(String number) {
        int weight = 0;
        for (int i = 0; i < number.length(); i++) {
            weight += number.charAt(i) - '0';
        }
        return weight;
    }

    public static void sortByWeight(String[] array) {
        int i = 1;
        while (i > 0) {
            i = 0;
            for (int j = 1; j < array.length; j++) {
                int weight1 = Weight(array[j - 1]);
                int weight2 = Weight(array[j]);
                if (weight1 == weight2) {
                    String string1 = array[j - 1];
                    String string2 = array[j];
                    if (string1.compareTo(string2) > 0) {
                        swap(array, j - 1, j);
                        i++;
                    }
                } else if (weight1 > weight2) {
                    swap(array, j - 1, j);
                    i++;
                }
            }
        }
    }

    public static void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static String arrayToString(String[] array) {
        String string = "";
        for (int i = 0; i < array.length - 1; i++) {
            string += array[i] + " ";
        }
        string += array[array.length - 1];
        return string;
    }


  /*
    public static String orderWeight(String strng) {
        String rs = "";
        String[] sInput = strng.split(" ");
        List<String> stringList = Arrays.asList(sInput);
        *//*
        Collections.sort(stringList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (getStringSum(o1.toString()) > getStringSum(o2.toString())) {
                    return 1;
                } else if (getStringSum(o1.toString()) == getStringSum(o2.toString())) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        *//*
        Collections.sort(stringList, (o1, o2) -> getStringSum(o1) - getStringSum(o2));
        for (int i = 0; i < stringList.size(); i++) {
            rs = rs + stringList.get(i) + " ";
        }
        rs = rs.trim();
        return rs;
    }

    private static int getStringSum(String s) {
        int num = Integer.parseInt(s);
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }*/
}
