package com.example.myresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        ContentResolver resolver=getContentResolver();
        Uri uri=Uri.parse("content://wmy.provider2/student");
        ContentValues values=new ContentValues();
        values.put("name","wmy");
        values.put("age",19);
        values.put("sex","女");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolver.insert(uri,values);
            }
        });
    }
}