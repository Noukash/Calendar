package andrey.calendar;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Andrey on 24.02.2016.
 */
public class DbOpenHelper extends SQLiteOpenHelper {
    Context mcontext;

    final static String DB_NAME = "calendar.db";
    final static int DB_VERSION = 1;
    public final static String DB_TABLE = "Calendar";
    public static final String COLUMN_NAME = "Event_Name";
    public static final String COLUMN_WITHFAMILY="Отдых с семьей";
    public static final String COLUMN_SEA="Море и песок";
    public static final String COLUMN_ACTIVE="Активный отдых";
    public static final String COLUMN_BUSINESS="Деловой туризм";
    public static final String COLUMN_SIGHTSEEING="Достопримечательности";
    public static final String COLUMN_MONTH = "Event_Month";
    public static final String COLUMN_DAY = "Event_Day";
    public static final String COLUMN_COUNTRY = "Event_Country";
    public static final String COLUMN_IMAGE = "Event_Image";
    public static final String COLUMN_TEXT = "Event_Text";
    public static final String[] COLUMNS = {COLUMN_NAME, COLUMN_ACTIVE, COLUMN_MONTH, COLUMN_DAY, COLUMN_COUNTRY, COLUMN_IMAGE, COLUMN_TEXT,COLUMN_SEA,COLUMN_BUSINESS,COLUMN_SIGHTSEEING,COLUMN_WITHFAMILY};
    private static String
            DB_CREATE = "CREATE TABLE " + DB_TABLE +
            " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT, " + COLUMN_MONTH + " INTEGER, " + COLUMN_DAY + " INTEGER, "
            + COLUMN_COUNTRY + " INTEGER, " + COLUMN_IMAGE + " INTEGER, " + COLUMN_TEXT + " TEXT, "+
            COLUMN_ACTIVE+ " INTEGER, " + COLUMN_WITHFAMILY+ " INTEGER, " + COLUMN_SEA+ " INTEGER, " + COLUMN_BUSINESS
            + " INTEGER, " + COLUMN_SIGHTSEEING+ " INTEGER, " + COLUMN_TEXT+
            " INTEGER);";

    public DbOpenHelper(Context context) {

        super(context, DB_NAME, null, DB_VERSION);
        mcontext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
        InsertData(db, "Масленица", 2, 13, 16, R.drawable.maslenitsa, "Очень интересный праздник, блинный",1,0,1,0,1);
        InsertData(db, "Котовье", 3, 27, 4, R.drawable.kotove, "Котовье празднуют все коты от мала до велика",0,1,0,0,1);
        InsertData(db, "День рождения Поли", 9, 26, 1, R.drawable.polina, "Самый лучший день в году",1,1,1,1,1);
        InsertData(db, "День маляра", 7, 13, 9, R.drawable.kraska, "Очень интересный и красочный праздник",0,0,1,1,0);
        InsertData(db, "День птичего ягодника",  8, 20, 17, R.drawable.berry, "В этот день все птицы Вестериал Птиц собираются собирать ягоду, вот такой вот незатейливый денечек :)",1,0,0,1,1);
        InsertData(db, "День маляра в тайланде !!!!!", 7, 13, 5, R.drawable.kraska, "Очень интересный и красочный праздник, но не в Болгарии, а ТАЙЛАНДЕ",0,1,1,1,0);



    }


    public void InsertData(SQLiteDatabase db, String name, int month, int day, int country, int image, String text,int Active,int withfamily, int sea, int business, int sightseeing) {

        ContentValues values = new ContentValues(1);
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_MONTH, month);
        values.put(COLUMN_DAY, day);
        values.put(COLUMN_COUNTRY, country);
        values.put(COLUMN_IMAGE, image);
        values.put(COLUMN_TEXT, text);
        values.put(COLUMN_ACTIVE, Active);
        values.put(COLUMN_WITHFAMILY, withfamily);
        values.put(COLUMN_SEA, sea);
        values.put(COLUMN_BUSINESS, business);
        values.put(COLUMN_SIGHTSEEING, sightseeing);



        db.insert(DB_TABLE, null, values);

    }

//onupgrade - вызывается вручную
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}