package com.logora.testapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.logora.logora_sdk.WidgetFragment;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WidgetFragment widget = new WidgetFragment(this, "mon-article", "logora-demo-app");
        getSupportFragmentManager().beginTransaction()
                .add(R.id.logora_widget_container, widget)
                .commit();
    }
}