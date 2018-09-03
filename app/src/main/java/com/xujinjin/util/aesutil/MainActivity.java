package com.xujinjin.util.aesutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String result = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        final TextView tv3 = (TextView)findViewById(R.id.tv3);
        final Button bt = (Button)findViewById(R.id.bt);
        final Button bt2 = (Button)findViewById(R.id.bt2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = et1.getText().toString();
                String key = et2.getText().toString();
                try {
                    result = AES.Encrypt(content,key);
                } catch (Exception e) {
                    e.printStackTrace();
                }tv3.setText(result);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = et1.getText().toString();
                String key = et2.getText().toString();
                try {
                    result = AES.Decrypt(result,key);
                } catch (Exception e) {
                    e.printStackTrace();
                }tv3.setText(result);

            }
        });
    }
}
