import java.util.*;

public class CountryHashTable {

    Hashtable<String, String> table = new Hashtable<>();

    public void saveCountryCapital(String country, String capital) {
        table.put(country, capital);
    }

    public String getCapital(String country) {
        return table.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : table.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capital))
                return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {

        CountryHashTable obj = new CountryHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("Japan"));
        System.out.println(obj.getCountry("Delhi"));
    }
}