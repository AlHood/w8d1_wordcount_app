package wc.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText paragraphEditText;
    Button countButton;
    TextView responseText;
StringSplitter striSpli;
    int totalWords;
String wordOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);


        paragraphEditText = (EditText) findViewById(R.id.paragraph_edittext);

        countButton = (Button) findViewById(R.id.count_btn);

        responseText = (TextView) findViewById(R.id.response_text);
    }



    public void onCountButtonClicked(View button) {

//        put paragraphEditText into your string splitter/word counter method
//        output via response Text with interpolation

       totalWords = StringSplitter.countWords(striSpli = new StringSplitter(paragraphEditText));
        wordOutput = ("There are %d words in the paragraph entered", totalWords)
      responseText.setText(wordOutput);





    }

}