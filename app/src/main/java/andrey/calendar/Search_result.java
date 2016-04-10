package andrey.calendar;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Search_result extends Activity {
SQLiteDatabase mDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        /*
        ImageView kartinka=(ImageView)findViewById(R.id.Eventimage);
        TextView text=(TextView) findViewById(R.id.EventText);
        MainActivity x=new MainActivity();
        Intent i=getIntent();
        int country=i.getIntExtra("country code", 0);
        String nstring=""+country;
        String selectionargs[]={nstring};
        DbOpenHelper dbHelper=new DbOpenHelper(this);
        mDb=dbHelper.getReadableDatabase();
        String selection=dbHelper.COLUMN_COUNTRY+"=?";
        Cursor newCursor =mDb.query(dbHelper.DB_TABLE,null,selection,selectionargs,null,null,null);
        newCursor.moveToFirst();
        text.setText(newCursor.getString(7));
        kartinka.setImageResource(newCursor.getInt(6));
        mDb.close();
        */

    }
}
