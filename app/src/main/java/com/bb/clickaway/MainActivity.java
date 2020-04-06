package com.bb.clickaway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private ImageView imageView;
    private TextView counterTxt;
    private Button youngerBtn;
    private Button olderBtn;
    private Button resetBtn;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){

                switch (view.getId()){
                case R.id.youngerBtn :
                    youngerCounter();
                    break;
                case R.id.olderBtn :
                    olderCounter();
                    break;
                case R.id.resetBtn :
                    initCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTxt = (TextView) findViewById(R.id.counterTxt);
        youngerBtn = (Button) findViewById(R.id.youngerBtn);
        youngerBtn.setOnClickListener(clickListener);
        olderBtn = (Button) findViewById(R.id.olderBtn);
        olderBtn.setOnClickListener(clickListener);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(clickListener);
        imageView = findViewById(R.id.imageView);

        initCounter();
    }

    private void initCounter() {
        counter = 0;
        counterTxt.setText(counter + "");
        imageView.setImageDrawable(getDrawable(R.drawable.children_gowing));

    }
    private void olderCounter(){
        counter++;
        counterTxt.setText(counter + "");
        if (counter < 0)
            imageView.setImageDrawable(getDrawable(R.drawable.children_gowing));
        if (counter > 0)
            imageView.setImageDrawable(getDrawable(R.drawable.baby));
        if (counter > 1)
            imageView.setImageDrawable(getDrawable(R.drawable.toddler3));
        if (counter > 4)
            imageView.setImageDrawable(getDrawable(R.drawable.older_kids));
        if (counter > 12)
            imageView.setImageDrawable(getDrawable(R.drawable.teens2));
        if (counter > 19)
            imageView.setImageDrawable(getDrawable(R.drawable.adults));
        if (counter > 64)
            imageView.setImageDrawable(getDrawable(R.drawable.seniors));
    }
    private void youngerCounter(){
        counter--;
        counterTxt.setText(counter + "");
        if (counter < 0)
            imageView.setImageDrawable(getDrawable(R.drawable.children_gowing));
        if (counter > 0)
            imageView.setImageDrawable(getDrawable(R.drawable.baby));
        if (counter > 1)
            imageView.setImageDrawable(getDrawable(R.drawable.toddler3));
        if (counter > 4)
            imageView.setImageDrawable(getDrawable(R.drawable.older_kids));
        if (counter > 12)
            imageView.setImageDrawable(getDrawable(R.drawable.teens2));
        if (counter > 19)
            imageView.setImageDrawable(getDrawable(R.drawable.adults));
        if (counter > 64)
            imageView.setImageDrawable(getDrawable(R.drawable.seniors));

    }
}

