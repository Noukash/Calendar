package andrey.calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Choose_where extends Activity {
    RecyclerView recyclerView;
    public static final String WhereImages="WHEREIMAGES";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_where);
        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView_choose_where);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new ItemDecorator_where_why(25, 15, 15, 25, 15));
        recyclerView.setAdapter(new MyRecyclerViewAdapter_where_why(this,WhereImages));




    }
}