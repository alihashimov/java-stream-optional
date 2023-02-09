package az.et.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<>() {
        {
            put("Jos de Vos", "016/161616"); //null NullPointerException
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    private final HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook() {
    }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name) {
        return Optional.ofNullable(PHONE_NUMBERS.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(phoneNumber))
                .map(stringStringEntry -> stringStringEntry.getKey())
                .findFirst();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}