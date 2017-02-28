package wc.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CounterOutputActivity extends AppCompatActivity {

    TextView response_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_output);

        response_textview = (TextView) findViewById(R.id.response_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String response = extras.getString("response");

        response_textview.setText(response);


    }
}
