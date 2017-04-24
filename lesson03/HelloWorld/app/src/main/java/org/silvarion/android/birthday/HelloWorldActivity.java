package org.silvarion.android.birthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

    protected void callAnotherBirthday(View v) {
        Intent intent = new Intent(HelloWorldActivity.this, AnotherBirthday.class);
        HelloWorldActivity.this.startActivity(intent);
    }
}
