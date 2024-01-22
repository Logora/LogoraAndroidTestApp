package com.logora.testapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.logora.logora_sdk.WidgetFragment;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIxMjM0NTY3ODI5IiwiZmlyc3RfbmFtZSI6IlNveWEiLCJsYXN0X25hbWUiOiJTb3lhIiwiZW1haWwiOiJzb3lhQGdtYWlsLmNvbSJ9.s213UFjD7kXAsQ2-foJvJ1S3Im6oKuUxgEWTYD4kn9Y";
        WidgetFragment widget = new WidgetFragment(this, "mon-article", "logora-demo-app",null);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.logora_widget_container, widget)
                .commit();
    }
}