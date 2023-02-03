package az.et.stream;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        int totalNumberOfLettersOfNamesLongerThanFive
                = getTotalNumberOfLettersOfNamesLongerThanFive("Ali", "Hashimov", "test");
        System.out.println("totalNumberOfLettersOfNamesLongerThanFive:" + totalNumberOfLettersOfNamesLongerThanFive);
    }

    //Beşdən böyük adların hərflərinin ümumi sayını əldə edin
    //Butun Array elementlerini elde edin => stream()
    //5 den uzun adlari  filtrele => filter()
    //Geri qalan lisdeki butun herflerin sayini getir => mapToInt()
    //herf saylarini topla => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5) //Stream<String> if (name.length() > 5)
                .mapToInt(String::length) //Stream<Integer>
                .sum();
    }

}
