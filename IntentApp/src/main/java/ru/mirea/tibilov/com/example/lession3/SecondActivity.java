package ru.mirea.tibilov.com.example.lession3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("message").toString();

        textView.setText("«КВАДРАТ ЗНАЧЕНИЯ\n" +
                "МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 625, а текущее\n" +
                "время" + name);
    }
}