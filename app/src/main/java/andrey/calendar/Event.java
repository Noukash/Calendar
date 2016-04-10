package andrey.calendar;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class Event extends Activity {
    public static final String INTENT_EXTRA_RECORD_ID="RECORD_ID";
    SQLiteDatabase mDB;

//TODO make it work with database+ do inject with database and dagger
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Intent intent=getIntent();
        if(intent.hasExtra(INTENT_EXTRA_RECORD_ID)){

        }
    }
}
