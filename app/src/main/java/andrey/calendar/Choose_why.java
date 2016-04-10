package andrey.calendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Choose_why extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_why);

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_choose_why);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

    }
        private ArrayList<ItemDetails> GetSearchResults(){
            ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
            ItemDetails item_details = new ItemDetails();

            item_details = new ItemDetails();
            item_details.set1Name("Германия");
            item_details.setItem1Description("Пиво сосиски");
            item_details.setImage1Number(1);
            item_details.set2Name("Россия");
            item_details.setItem2Description("Великая могучая");
            item_details.setImage2Number(2);
            results.add(item_details);

            item_details = new ItemDetails();
            item_details.set1Name("Франция");
            item_details.setItem1Description("Буржуа лягушки");
            item_details.setImage1Number(3);
            item_details.set2Name("Тайланд");
            item_details.setItem2Description("Отдых проститутки");
            item_details.setImage2Number(4);
            results.add(item_details);

            item_details = new ItemDetails();
            item_details.set1Name("Вестериал птиц");
            item_details.setItem1Description("Птички, Маросейка");
            item_details.setImage1Number(5);
            item_details.set2Name("Россия");
            item_details.setItem2Description("Холод, Водка");
            item_details.setImage2Number(6);
            results.add(item_details);


            return results;
    }
}
