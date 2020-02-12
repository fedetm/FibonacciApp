package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button boton;
    TextView texto;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.boton);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int n = 5;
                TextView mText = new TextView(getApplicationContext());
                mText = findViewById(R.id.sucesion);
                ArrayList<Integer> sucesion = new ArrayList<Integer>();
                sucesion.add(fibonacci(n));
                for (int i:sucesion
                     ) {
                    mText.setText(mText.getText()+"\n"+i);
                }

            }

        });
    }

    int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
