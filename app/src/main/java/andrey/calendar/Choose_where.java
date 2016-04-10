package andrey.calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Choose_where extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_where);

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_choose_where);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails)o;
                Toast.makeText(Choose_where.this, "You have chosen : " + " " + obj_itemDetails.get1Name(), Toast.LENGTH_LONG).show();
            }
        });
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