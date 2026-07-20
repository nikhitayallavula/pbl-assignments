import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        Iterator<String> itr = T1.iterator();

        while (itr.hasNext()) {
            String country = itr.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("Canada"));
    }
}