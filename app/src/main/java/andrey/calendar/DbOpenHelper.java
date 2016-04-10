package andrey.calendar;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Calendar;

/**
 * Created by Andrey on 24.02.2016.
 */
public class DbOpenHelper extends SQLiteOpenHelper {
    Context mcontext;

    final static String DB_NAME = "calendar.db";
    final static int DB_VERSION = 1;
    public final static String DB_TABLE = "Calendar";
    public static final String COLUMN_NAME = "Event_Name";
    public static final String COLUMN_TYPE = "Event_Type";
    public static final String COLUMN_MONTH = "Event_Month";
    public static final String COLUMN_DAY = "Event_Day";
    public static final String COLUMN_COUNTRY = "Event_Country";
    public static final String COLUMN_IMAGE = "Event_Image";
    public static final String COLUMN_TEXT = "Event_Text";
    public static final String[] COLUMNS = {COLUMN_NAME, COLUMN_TYPE, COLUMN_MONTH, COLUMN_DAY, COLUMN_COUNTRY, COLUMN_IMAGE, COLUMN_TEXT};
    private static String
            DB_CREATE = "CREATE TABLE " + DB_TABLE +
            " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT, " + COLUMN_TYPE +
            " TEXT, " + COLUMN_MONTH + " INTEGER, " + COLUMN_DAY + " INTEGER, " + COLUMN_COUNTRY + " INTEGER, " + COLUMN_IMAGE + " INTEGER, " + COLUMN_TEXT + " TEXT);";

    public DbOpenHelper(Context context) {

        super(context, DB_NAME, null, DB_VERSION);
        mcontext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
        InsertData(db, "Масленица", "124", 2, 13, 16, R.drawable.maslenitsa, "Очень интересный праздник, блинный");
        InsertData(db, "Котовье", "124", 3, 27, 4, R.drawable.kotove, "Котовье празднуют все коты от мала до велика");
        InsertData(db, "День рождения Поли", "124", 9, 26, 1, R.drawable.polina, "Самый лучший день в году");
        InsertData(db, "День маляра", "124", 7, 13, 9, R.drawable.kraska, "Очень интересный и красочный праздник");
        InsertData(db, "День птичего ягодника", "124", 8, 20, 17, R.drawable.berry, "В этот день все птицы Вестериал Птиц собираются собирать ягоду, вот такой вот незатейливый денечек :)");
        InsertData(db, "День маляра в тайланде !!!!!", "124", 7, 13, 5, R.drawable.kraska, "Очень интересный и красочный праздник, но не в Болгарии, а ТАЙЛАНДЕ");


    }


    public void InsertData(SQLiteDatabase db, String name, String type, int month, int day, int country, int image, String text) {

        ContentValues values = new ContentValues(1);
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_TYPE, type);
        values.put(COLUMN_MONTH, month);
        values.put(COLUMN_DAY, day);
        values.put(COLUMN_COUNTRY, country);
        values.put(COLUMN_IMAGE, image);
        values.put(COLUMN_TEXT, text);


        db.insert(DB_TABLE, null, values);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}