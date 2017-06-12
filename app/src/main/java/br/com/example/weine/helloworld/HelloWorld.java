package br.com.example.weine.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {
    private TextView tviTeste;
    private Button btOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        findViews();
        setAction();
    }

    private void findViews() {
        tviTeste = (TextView)findViewById(R.id.tvi_teste);
        btOk = (Button) findViewById(R.id.bt_ok);
    }

    private void setAction(){
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tviTeste.setText("coisa qualquer");
            }
        });



    }
}
