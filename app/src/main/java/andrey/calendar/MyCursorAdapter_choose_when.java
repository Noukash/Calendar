package andrey.calendar;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

/**
 * Created by Andrey on 15.03.2016.
 */
public class MyCursorAdapter_choose_when extends SimpleCursorAdapter {

    int _layout;
    public MyCursorAdapter_choose_when(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        _layout=layout;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(_layout, parent, false);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String title_string=cursor.getString(cursor.getColumnIndex(DbOpenHelper.COLUMN_NAME));
        TextView title_view=(TextView)view.findViewById(R.id.when_title_text);
        title_view.setText(title_string);
        super.bindView(view, context, cursor);
    }
}
