package andrey.calendar;

import android.content.Context;

import java.util.Collection;
import java.util.Hashtable;

/**
 * Created by Andrey on 28.02.2016.
 */
public class Helper {
    public Hashtable<Integer, String> countries = new Hashtable<Integer, String>();

    public void setCountries(Context context) {

        countries.put(1,context.getString(R.string.Country_France));
        countries.put(2, context.getString(R.string.Country_Spain));
        countries.put(3, context.getString(R.string.Country_China));
        countries.put(4, context.getString(R.string.Country_Germany));
        countries.put(5, context.getString(R.string.Country_Thailand));
        countries.put(6, context.getString(R.string.Country_Italy));
        countries.put(7, context.getString(R.string.Country_Greece));
        countries.put(8, context.getString(R.string.Country_Israel));
        countries.put(9, context.getString(R.string.Country_Bulgary));
        countries.put(10, context.getString(R.string.Country_Chernogoriya));
        countries.put(11, context.getString(R.string.Country_Czech));
        countries.put(12, context.getString(R.string.Country_Vietnam));
        countries.put(13, context.getString(R.string.Country_India));
        countries.put(14, context.getString(R.string.Country_Emirates));
        countries.put(15, context.getString(R.string.Country_Horvatia));
        countries.put(16, context.getString(R.string.Country_Russia));
        countries.put(17, "Вестериал Птиц");
    }

    public String getCountry(int key) {
        return countries.get(key);

    }
}
