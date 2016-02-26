package com.su.lapponampai_w.counter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();


            /*public void onClick (View v){
                Context context = getApplicationContext();
                String msg = "Click!!!!";
                int duration = Toast.LENGTH_SHORT;

                Toast t = Toast.makeText(context, msg, duration);
                t.show();

            }*/
    }



    private void bindwidget() {
        Button btn = (Button) findViewById(R.id.count_button);
        btn.setOnClickListener(

                new View.OnClickListener() {
                @Override

                    public void onClick(View v) {
                    Context context = getApplicationContext();
                    String msg = "Click!!!!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast t = Toast.makeText(context, msg, duration);
                    t.show();


                    }
                });

    }
}
