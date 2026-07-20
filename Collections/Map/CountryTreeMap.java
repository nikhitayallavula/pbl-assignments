import java.util.*;

public class CountryTreeMap {

    TreeMap<String, String> map = new TreeMap<>();

    public void saveCountryCapital(String country, String capital) {
        map.put(country, capital);
    }

    public String getCapital(String country) {
        return map.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capital))
                return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {

        CountryTreeMap obj = new CountryTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
    }
}