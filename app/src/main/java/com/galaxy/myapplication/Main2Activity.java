package com.galaxy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity{

    private EditText mEtTexto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEtTexto = (EditText) findViewById(R.id.et_texto);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mEtTexto.setText("");
    }

    public void onNext(View view){
        String texto = mEtTexto.getText().toString();

        Intent intent = new Intent(this,Main3Activity.class);
        intent.putExtra("para1",texto);
        startActivity(intent);
    }
}

