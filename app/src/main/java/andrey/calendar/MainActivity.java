package andrey.calendar;

import android.app.Activity;
import android.content.ContentValues;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class MainActivity extends Activity {

    String lala;

    Helper helper=new Helper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper.setCountries(getApplicationContext());







      }


    public void OnClickWhere(View view) {
        Intent i=new Intent(MainActivity.this,Choose_where.class);
        startActivity(i);
    }

    public void OnClickWhy(View view) {
        Intent i=new Intent(MainActivity.this, Choose_why.class);
        startActivity(i);
    }

    public void OnClickWhen(View view) {
        Intent i= new Intent(this, Choose_when.class);
        startActivity(i);
    }
}

