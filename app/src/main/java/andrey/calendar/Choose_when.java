package andrey.calendar;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

import java.util.List;

public class Choose_when extends ListActivity {
    DbOpenHelper dbHelper;
    SQLiteDatabase mDb;
    Cursor newCursor;
    MyCursorAdapter_choose_when adapter;
    MaterialCalendarView materialCalendarView;
    public static final String INTENT_EXTRA_RECORD_ID="RECORD_ID";
    public static final String INTENT_ACTION_FROM_WHENLIST="FROMWHENLIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_when);
        init();
        final Context context=this;
        materialCalendarView=(MaterialCalendarView)findViewById(R.id.calendarView);
        materialCalendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                init();

            }
        });

        materialCalendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(MaterialCalendarView widget, CalendarDay date, boolean selected) {
                String[] from = {DbOpenHelper.COLUMN_NAME,};
                int[] to = {R.id.when_title_text};
                int SelectedMonth=date.getMonth()+1;
                int SelectedDay = date.getDay();
                int MinMonth = date.getMonth()+1;
                int MinDay, MaxDay, MaxMonth;
                MaxMonth = date.getMonth()+1;
                MinDay = SelectedDay - 20;
                if (MinDay < 0) {
                    MinDay = MinDay + 30;
                    MinMonth = MinMonth - 1;
                }
                MaxDay = SelectedDay + 20;
                if (MaxDay > 30) {
                    MaxDay = MaxDay - 30;
                    MaxMonth = MaxMonth + 1;
                }
                //TODO intent to searchresults
                String selectionargs[]={MinMonth+"",MinDay+"",MaxMonth+"",+MaxDay+"",SelectedMonth+""};
                String selection=dbHelper.COLUMN_MONTH+"=?"+" AND "+dbHelper.COLUMN_DAY+">=?" +" OR "+dbHelper.COLUMN_MONTH+"=?"+" AND "+dbHelper.COLUMN_DAY+"<=?"+" OR "+dbHelper.COLUMN_MONTH+"=?";
                dbHelper = new DbOpenHelper(context);
                mDb = dbHelper.getReadableDatabase();
                newCursor = mDb.query(dbHelper.DB_TABLE, null, selection, selectionargs, null, null, null);
                adapter = new MyCursorAdapter_choose_when(context, R.layout.item_details_when_view, newCursor, from, to, 1);
                getListView().setAdapter(adapter);



            }
        });


    }

    private void init() {
        CalendarDay date=new CalendarDay();
        String[] from = {DbOpenHelper.COLUMN_NAME,};
        int[] to = {R.id.when_title_text};
        dbHelper = new DbOpenHelper(this);
        mDb = dbHelper.getReadableDatabase();
        String nstring=""+date.getMonth()+1;
        String selectionargs[]={nstring};
        String selection=dbHelper.COLUMN_MONTH+"=?";
        newCursor =mDb.query(dbHelper.DB_TABLE, null, selection,selectionargs, null, null, null);
        adapter = new MyCursorAdapter_choose_when(this, R.layout.item_details_when_view, newCursor, from, to,1);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent=new Intent(Choose_when.this,Event.class);
                intent.putExtra(INTENT_EXTRA_RECORD_ID,id);
                startActivity(intent);

            }
        });
    }




}
